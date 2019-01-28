package online.pubudu.framework.service;

/**
 * Interface to be implementd by the Provider for Account APIs.
 * @author pubudu welagedara
 * @see <a href="http://pubudu.online">pubudu.online</a>
 */
public interface AccountService<T> {

    T getAccounts();
}
