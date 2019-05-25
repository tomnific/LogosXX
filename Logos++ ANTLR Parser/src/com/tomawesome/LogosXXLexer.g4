lexer grammar LogosXXLexer;
import ObjectiveCLexer;





/*

I know, I know - the "LOGOS_" isn't pretty and in most cases unnecessary.
BUT there is a method to this madness - it's because Logos++ is divided into FOUR source files:


After many moons of trying to connect them together, the ideal solution of having LogosXXParser including EVERYTHING else
was causing a few bizarre issues that did not appear when simply prepending the Objective-C souce with the Logos rules.

I don't know what/why exactly, but it boils down to not being able to set two tokenVocabs.
So to fix, we simply import the Objective-C Lexer here, instead of the LogosXXParser (which is the part that acutally needs it).
BUT some of the Logos++ token names clashed with Objective-C ones, so for the sake of uniformity they all got "LOGOS_" prefixed to them,
as it looks better than only some having a prefix or differently-styled name.

Obviously, this not really about the prefix - it's about reminding how this thing is strung together through the story of the prefix,
and also serves as a way to procrastinate.

*/




// Top Level
LOGOS_CONFIG:       '%config';

LOGOS_HOOKF:        '%hookf';

LOGOS_HOOKSWIFTF:   '%hookswiftf';

LOGOS_CTOR:         '%ctor';

LOGOS_DTOR:         '%dtor';




// Block Level
LOGOS_GROUP:        '%group';

LOGOS_HOOK:         '%hook';

LOGOS_HOOKSWIFT:    '%hookswift';

LOGOS_NEW:          '%new\n';

LOGOS_SUBCLASS:     '%subclass';

LOGOS_PROPERTY:     '%property';

LOGOS_END:          '%end';




// Function Level
LOGOS_INIT:         '%init';

LOGOS_CLASS:        '%class';

LOGOS_CALLSWIFT:    '%callswift';

LOGOS_ORIG:         '%orig';

LOGOS_LOG:          '%log';



//NEWLINE: ('\r\n'|'\n'|'\r');
//WS  : [ \t\r\n]+ -> skip ;