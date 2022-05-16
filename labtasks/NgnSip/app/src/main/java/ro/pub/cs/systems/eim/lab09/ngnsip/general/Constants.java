package ro.pub.cs.systems.eim.lab09.ngnsip.general;

public interface Constants {

    final public static String TAG = "[NgnSIP]";

    final public static boolean DEBUG = true;

    // TODO exercise 4
    // fill in the USERNAME, IDENTITY_IMPI, IDENTITY_PASSWORD, DOMAIN, NETWORK_REALM
    final public static String USERNAME = "anton.puiu";
    final public static String IDENTITY_IMPI = "anton.puiu@sip.linphone.org";
    final public static String IDENTITY_PASSWORD = "salut";
    final public static String DOMAIN = "sip.linphone.org";
    final public static String NETWORK_PCSCF_HOST = "sip.linphone.org";
    final public static int NETWORK_PCSCF_PORT = 5060;
    final public static String NETWORK_REALM = "sin.linphone.org";

    final public static boolean NETWORK_USE_3G = true;
    final public static int NETWORK_REGISTRATION_TIMEOUT = 3600;

    final public static String SIP_ADDRESS = "ro.pub.cs.systems.eim.lab09.ngnsip.SipAddress";

    final public static int ACCEPT_CALL_DELAY_TIME = 2000;
}
