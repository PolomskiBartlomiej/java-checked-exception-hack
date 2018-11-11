# java-checked-exception-hack
_Reference_: https://stackoverflow.com/questions/14524751/cast-object-to-generic-type-for-returning  
_Reference_: http://blog.ragozin.info/2011/10/java-how-to-throw-undeclared-checked.html  
_Reference_: https://stackoverflow.com/questions/11942946/how-to-throw-an-exception-when-your-method-signature-doesnt-allow-to-throw-exce  
_Reference_: https://www.gamlor.info/wordpress/2010/02/throwing-checked-excpetions-like-unchecked-exceptions-in-java/

# description
Show how to convert checked java exception to unchecked exception

```
static <T extends Throwable> void toUnchecked(Exception exception) throws T {
        throw (T) exception;
}
    
```
