package androidAutomation;

public interface ILocators {

    String app = "com.android.launcher3:content-desc/Apps";
    String Allow_permissions ="com.android.packageinstaller:id/permission_allow_button";

    //----------------------------------------------- RealiseMe ------------------------------------------------//
    String loginButton = "//android.view.ViewGroup[@index='5']";
    String username_field = "//android.widget.EditText";
    String password_field = "//android.view.ViewGroup[@index='3']//android.widget.EditText";

    String loginButton2 = "com.snapchat.android:id/registration_nav_container";
    String friends_button = "com.snapchat.android:id/hova_nav_feed_label";
    String start_chat = "com.snapchat.android:id/bottom_panel";
    String input_field = "com.snapchat.android:id/chat_input_text_field";
    String new_chat_button = "com.snapchat.android:id/neon_header_new_chat_button";
    String Receiver = "com.snapchat.android:id/recipient_bar_edit_text";
    String Allow_permisiions_main = "com.snapchat.android:id/turn_on_button";


}
