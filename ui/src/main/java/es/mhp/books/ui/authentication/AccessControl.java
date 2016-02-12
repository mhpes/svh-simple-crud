package es.mhp.books.ui.authentication;

/**
 * Simple interface for authentication and authorization checks.
 */
public interface AccessControl {

    boolean signIn(String username, String password);

    boolean isUserSignedIn();

    boolean isUserInRole(String role);

    String getPrincipalName();
}
