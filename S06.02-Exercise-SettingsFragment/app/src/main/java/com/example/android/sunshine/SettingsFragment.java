package com.example.android.sunshine;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.preference.EditTextPreference;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.support.v7.preference.PreferenceScreen;

public class SettingsFragment extends PreferenceFragmentCompat
        implements SharedPreferences.OnSharedPreferenceChangeListener {
    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        addPreferencesFromResource(R.xml.pref_settings);

        SharedPreferences sharedPreferences=getPreferenceScreen().getSharedPreferences();
        PreferenceScreen preferenceScreen=getPreferenceScreen();
        int count=preferenceScreen.getPreferenceCount();


    }


    private void setPreferenceSummary(Preference preference,Object o){
        if(preference instanceof EditTextPreference){

        }
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {

    }

    @Override
    public void onStart() {
        super.onStart();
        /* Register the preference change listener */
        getPreferenceScreen().getSharedPreferences()
                .registerOnSharedPreferenceChangeListener(this);
    }


    @Override
    public void onStop() {
        super.onStop();
        /* Unregister the preference change listener */
        getPreferenceScreen().getSharedPreferences()
                .unregisterOnSharedPreferenceChangeListener(this);
    }

}
