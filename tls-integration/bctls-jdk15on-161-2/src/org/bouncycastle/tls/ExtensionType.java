package org.bouncycastle.tls;

public class ExtensionType
{
    /*
     * RFC 2546 2.3.
     */
    public static final int server_name = 0;
    public static final int max_fragment_length = 1;
    public static final int client_certificate_url = 2;
    public static final int trusted_ca_keys = 3;
    public static final int truncated_hmac = 4;
    public static final int status_request = 5;

    /*
     * RFC 4681
     */
    public static final int user_mapping = 6;

    /*
     * RFC 5878
     */
    public static final int client_authz = 7;
    public static final int server_authz = 8;

    /*
     * RFC 6091
     */
    public static final int cert_type = 9;

    /*
     * RFC 7919 (originally 'elliptic_curves' from RFC 4492)
     */
    public static final int supported_groups = 10;

    /*
     * RFC 4492 5.1.
     */
    public static final int ec_point_formats = 11;

    /*
     * RFC 5054 2.8.1.
     */
    public static final int srp = 12;

    /*
     * RFC 5246 7.4.1.4.
     */
    public static final int signature_algorithms = 13;

    /*
     * RFC 5764 9.
     */
    public static final int use_srtp = 14;

    /*
     * RFC 6520 6.
     */
    public static final int heartbeat = 15;

    /*
     * RFC 7301
     */
    public static final int application_layer_protocol_negotiation = 16;

    /*
     * RFC 6961
     */
    public static final int status_request_v2 = 17;

    /*
     * RFC 6962
     */
    public static final int signed_certificate_timestamp = 18;

    /*
     * RFC 7250
     */
    public static final int client_certificate_type = 19;
    public static final int server_certificate_type = 20;

    /*
     * RFC 7685
     */
    public static final int padding = 21;

    /*
     * RFC 7366
     */
    public static final int encrypt_then_mac = 22;

    /*
     * RFC 7627
     */
    public static final int extended_master_secret = 23;

    /*
     * draft-ietf-tokbind-negotiation-08
     */
    public static final int DRAFT_token_binding = 24;

    /*
     * RFC 7924
     */
    public static final int cached_info = 25;

    /*
     * RFC 8449
     */
    public static final int record_size_limit = 28;

    /*
     * RFC 5077 7.
     */
    public static final int session_ticket = 35;

    /*
     * RFC 8446
     */
    public static final int pre_shared_key = 41;
    public static final int early_data = 42;
    public static final int supported_versions = 43;
    public static final int cookie = 44;
    public static final int psk_key_exchange_modes = 45;
    public static final int certificate_authorities = 47;
    public static final int oid_filters = 48;
    public static final int post_handshake_auth = 49;
    public static final int signature_algorithms_cert = 50;
    public static final int key_share = 51;

    /*
     * RFC 5746 3.2.
     */
    public static final int renegotiation_info = 0xff01;


    /*
     * Custom added for CertLedger
     */

    public static final int client_block = 100;
    public static final int freshness_tolerence = 101;
    public static final int selected_block = 102;
    public static final int proof = 103;
}
