package com.laksana.weatherapplication.utils

import android.content.Context
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

fun showTempDisplaySettingDialog(context: Context, tempDisplaySettingManager: TempDisplaySettingManager) {
    val dialogBuilder = AlertDialog.Builder(context)
        .setTitle("Choose Display Units")
        .setMessage("Choose which temperature unit to use for temperature display")
        .setPositiveButton("F°"
        ) { _, _ -> tempDisplaySettingManager.updateSetting(TempDisplaySetting.Fahrenheit) }
        .setNeutralButton("C°") { _,_ ->
            tempDisplaySettingManager.updateSetting(TempDisplaySetting.Celsius)
        }
        .setOnDismissListener {
            Toast.makeText(context, "Setting will take affect on app restart", Toast.LENGTH_SHORT).show()
        }

    dialogBuilder.show()
}