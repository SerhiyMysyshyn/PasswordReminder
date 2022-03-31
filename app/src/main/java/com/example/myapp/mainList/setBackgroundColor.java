package com.example.myapp.mainList;

import com.example.myapp.R;

public class setBackgroundColor {

    public static int setColor(String pName){
        int color;
        switch (pName){
            case "Facebook":
                color = R.color.colorFacebook;
                break;
            case "Приват24":
                color = R.color.colorPrivat24;
                break;
            case "Instagram":
                color = R.color.colorInstagram;
                break;
            case "Vkontakte":
                color = R.color.colorVkontakte;
                break;
            case "Twitter":
                color = R.color.colorTwitter;
                break;
            case "Gmail":
                color = R.color.colorGmail;
                break;
            case "SoundCloud":
                color = R.color.colorSouncloud;
                break;
            case "GitHub":
                color = R.color.colorGitHub;
                break;
            case "Cisko NetaCad":
                color = R.color.colorCisko;
                break;
            case "Steam":
                color = R.color.colorSteam;
                break;
            case "Telegram":
                color = R.color.colorTelegram;
                break;
            case "Razer Central":
                color = R.color.colorRazercentral;
                break;
            case "Skype":
                color = R.color.colorSkype;
                break;
            case "Microsoft":
                color = R.color.colorMic_ro_soft;
                break;
            case "Rockstar Games":
                color = R.color.colorRockstar;
                break;
            case "Twitch":
                color = R.color.colorTwitch;
                break;
            default:
                color = R.color.colorNoItem;
                break;
        }
        return color;
    }
    
}
