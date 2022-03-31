package com.example.myapp.mainList;


import com.example.myapp.R;

public class setProgramImage {

    public static int setImage(String pName){
        int image;
        switch (pName){
            case "Facebook":
                image = R.drawable.facebook_icon;
                break;
            case "Приват24":
                image = R.drawable.privat24_icon;
                break;
            case "Instagram":
                image = R.drawable.instagram_icon;
                break;
            case "Vkontakte":
                image = R.drawable.vkontakte_icon;
                break;
            case "Twitter":
                image = R.drawable.twitter_icon;
                break;
            case "Gmail":
                image = R.drawable.g_m_ail_icon;
                break;
            case "SoundCloud":
                image = R.drawable.souncloud_icon;
                break;
            case "GitHub":
                image = R.drawable.github_icon;
                break;
            case "Cisko NetaCad":
                image = R.drawable.cisko_icon;
                break;
            case "Steam":
                image = R.drawable.steam_icon;
                break;
            case "Telegram":
                image = R.drawable.telegram_icon;
                break;
            case "Razer Central":
                image = R.drawable.razercentral_icon;
                break;
            case "Skype":
                image = R.drawable.skype_icon;
                break;
            case "Microsoft":
                image = R.drawable.mic_ro_soft_icon;
                break;
            case "Rockstar Games":
                image = R.drawable.rockstar_games_icon;
                break;
            case "Twitch":
                image = R.drawable.twitch_icon;
                break;
            default:
                image = R.drawable.ic_action_blur;
                break;
        }
        return image;
    }

}
