# java-checked-exception-hack
_Reference_: https://stackoverflow.com/questions/14524751/cast-object-to-generic-type-for-returning  
_Reference_: http://blog.ragozin.info/2011/10/java-how-to-throw-undeclared-checked.html  
_Reference_: https://stackoverflow.com/questions/11942946/how-to-throw-an-exception-when-your-method-signature-doesnt-allow-to-throw-exce  
_Reference_: https://www.gamlor.info/wordpress/2010/02/throwing-checked-excpetions-like-unchecked-exceptions-in-java/

# description
Project is presents how to convert checked java exception to unchecked exception using static method :

```
static <T extends Throwable> void toUnchecked(Exception exception) throws T {
        throw (T) exception;
}
    
```

When we used that trick, then we doesnt need to use try-catch method and exception dont chagne the type.
We can seee that in test below:

```

@Test(expected = CheckedException.class)
    public void toUnchecked() {
        CheckedExceptionUtils.toUnchecked(new CheckedException("throw checked exception !"));
    }
```

# usage
This feature is usful :
 1. When we catch chacked exception and wrap it to unchecked :
       ```
       ...
       try {
       methodThatThrowException();
       } catch(Exception e) {
       throw new RuntimeException(e);
       ...
       ```
        
 2. In Java Funtional API because it is not support the checked Exception
 
     Example:
     https://github.com/pivovarit/throwing-function

