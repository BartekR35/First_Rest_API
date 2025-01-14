package pl.edu.vistula.first_rest_api.shared.api.response;

//a class which handles what user see when exception occur
public class ErrorMessageResponse {

    private final String message;

    public ErrorMessageResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
