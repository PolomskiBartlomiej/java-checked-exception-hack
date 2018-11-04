final class CheckedExceptionUtils {

    static <T extends Throwable> void toUnchecked(Exception exception) throws T {
        throw (T) exception;
    }
}
