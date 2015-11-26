# DesignLib
Demo project of new material design support library
http://stackoverflow.com/questions/17623961/how-to-set-custom-color-on-selected-highlighted-list-item-in-activatedbackground
 <style name="MyRadioButton" parent="@android:style/Widget.CompoundButton.RadioButton">
        <item name="android:activatedBackgroundIndicator">@drawable/activated_background</item>
    </style>
    

<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:state_activated="true" android:drawable="@color/colorAccent" />
    <item android:state_selected="true" android:drawable="@color/colorAccent" />
    <item android:state_pressed="true" android:drawable="@color/colorAccent" />
</selector>
