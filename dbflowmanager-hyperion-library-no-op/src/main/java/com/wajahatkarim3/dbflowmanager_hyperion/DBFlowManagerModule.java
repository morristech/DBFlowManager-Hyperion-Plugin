package com.wajahatkarim3.dbflowmanager_hyperion;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.willowtreeapps.hyperion.plugin.v1.PluginModule;

public class DBFlowManagerModule extends PluginModule {

    @Nullable
    @Override
    public View createPluginView(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup parent)
    {
        View view = layoutInflater.inflate(R.layout.hdbfmanager_item_plugin_layout, parent, false);
        // No Op
        return view;
    }
}
