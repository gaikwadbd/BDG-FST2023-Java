package activities;

class CustomExceptions extends Exception {
    private String message = null;

    public CustomExceptions(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}