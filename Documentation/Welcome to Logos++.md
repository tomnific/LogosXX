# Welcome to Logos++
>This language is currently in beta, and subject to syntax changes

Logos++ is superset of Logos, which is a preprocessor language used by jailbreak tweaks to simplify the process of hooking classes. It accomplishes this by translating simple directives into more complex Objective-C++ code.

Hooking, if you're unfamiliar with the term, is the process of making a slight (often unauthorized) change to an existing implementation of a piece of code, without having to write your own implementation of it. For example, if you want to limit `fopen` to relative paths (as exampled below) without having to add checks in your own code every time `fopen` is called, you could simply hook the `fopen` function, have it perform your relative path check, and then either continue or halt its original execution.

One major limitation of Logos, is that it lacks support for Swift. While it is still *possible* to hook classes/functions and such, it's very clunky and requires bypassing logos and using the Objective-C++ code, which can make things very cluttered very quickly.

With the use of Swift on the rise, both for stock apps from Apple and by third party apps, this problem will only continue to become more prevalent. Swift support has been on the todo list of the official Logos maintainers for a while now, but there has been no indication of any progress on it thus-far. 

Logos++ aims to solve all of these problems, and bring easy Swift support to tweaks, while also still supporting ordinary Logos code. This means that instead of learning a whole new hooking language, developers only need to learn 3 new Swift-specifc directives that are reminiscent of their base Objective-C equivalents. In addition, Logos++ translates down to normal Logos, which means it's entirely compatible with the current Theos development environment.

<br>

## Hooking Functions
While not often done by developers, there may come a time that you wish to hook a specific function. 

For Objective-C, this can be done like so:

```logos
// example from original Logos documentation
%hookf(FILE *, fopen, const char *path, const char *mode)
{
	puts("Hey, we're hooking fopen to deny relative paths!");
    if (path[0] != '/') {
        return NULL;
    }
	return %orig; //%orig is a call to the original function
}
```

However, hooking a Swift function is not so easy. The following code hooks a function called `randomFunction` inside the `ViewController` class of an app named Hook Example App:

```logos
static void (*orig_ViewController_randomFunction)(void) = NULL;

void hook_ViewController_randomFunction() {
   orig_ViewController_randomFunction();
   NSLog(@"Hooked random function");
}

%ctor {
    %init(ViewController = objc_getClass("HookExampleApp.ViewController"));
    MSHookFunction(MSFindSymbol(NULL, "__T014HookExampleApp14ViewControllerC14randomFunctionyyF"),
                   (void*)hook_ViewController_randomFunction,
                   (void**)&orig_ViewController_randomFunction);
}
```

Not very pretty, is it? 
Now, here's that same function hooked with Logos++

```logosxx
%hookswiftf("HookExampleApp.ViewController", void, "__T014HookExampleApp14ViewControllerC14randomFunctionyyF", void)
{
	%orig;
	NSLog(@"Hooked random function");
}
```

Note that while it's parameters are still much more explicit than its Objective-C equivalent (knowing the name mangled name of the function is required), it is still immensely simpler than the current way of doing it.

<br>

## Hooking Classes
Hooking a class is the most important part of jailbreak tweak development. Logos allows you to modify and add functions to an existing class, in a way that feels just like a normal class definition - as long as it's Objective-C.

For example, say you wanted to print to the console every time a user uninstalled an application. After finding out what method is responsible for this, you would simply write the following Logos code:

```logos
%hook SBApplicationController
- (void)uninstallApplication:(SBApplication *)application 
{
    NSLog(@"Hey, we're hooking uninstallApplication:!");
    %orig;
}
%end
``` 

However, hooking a class in Swift is not quite as straight forward (though also not as messy as the previous Swift-in-Logos example). Let's take a look at hooking a view in the Music app.

```logos
%hook MusicInformativeView
-(void)layoutSubviews
{
	%orig;
	((MusicInformativeView*)self).title=@"hooked!";
}
%end

%ctor 
{
	%init(MusicInformativeView=objc_getClass("Music.InformativeView"));
}
```

Admittedly, this isn't so bad. However, it definitely could be better. Here's the same class hook, but in Logos++

```logosxx
%hookswift Music.InformativeView
- (void)layoutSubviews 
{
  %orig;
  ((MusicInformativeView*)self).title = @"hooked!";
}
%end

```
In fact, the Logos code above is actually what the Logos++ code translates down into. Though the difference may not appear major - it actually has a substantial impact. Many tweak developers actually work from their phones - meaning they use the tiny on-screen keyboard to type everything. Furthermore, most tweaks require hooking many classes, so for those devs, the savings add up over time.

<br>

## Calling Swift Functions
Finally, we have the call with no Logos equivalent. This is because in Logos, if you want to call an Objective-C function, you just call it - no directive needed. 

However, the same is not true for Swift functions. There is no built in mechanism to access them, much less to call them. It is still possible to throw something together that can call a Swift function, however it is not intuitive whatsoever.

Let's take that `randomFunction` from the earlier example. Say we didn't want to hook it, we simply wanted to call it. Using `MSFindSymbol`, we can call the function by finding the pointer to it

```logos
void *symbol = MSFindSymbol(NULL, "__T014HookExampleApp14ViewControllerC14randomFunctionyyF");
((void (*)(void)) symbol)(); // call it
```

For a void function with no parameters, this maybe isn't so bad. But it's definitely hard to understand what's going on with that function call without some deeper programming knowledge - which, fascinatingly enough, many tweak developers don't have.

However, with Logos++, it's a little more straightforward to call a Swift function

```logosxx
//      return type,         App.Class.Function,       parameter types, arguments
%callswift(void, "HookExampleApp.ViewController.randomFunction", (void), ());
```

<br>
<br>

And that, is Logos++. Plans for the future include the providing an alternate syntax so that developers can choose to either use the mangled name or the App.Class.Function notation with explicit return and parameter types. However, in its current state, it is 100% ready to use.
