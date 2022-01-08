// Generated by view binder compiler. Do not edit!
package com.inusui.venusdogcam.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.inusui.venusdogcam.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnTakePhoto;

  @NonNull
  public final Button btnToySound;

  @NonNull
  public final PreviewView viewFinder;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnTakePhoto,
      @NonNull Button btnToySound, @NonNull PreviewView viewFinder) {
    this.rootView = rootView;
    this.btnTakePhoto = btnTakePhoto;
    this.btnToySound = btnToySound;
    this.viewFinder = viewFinder;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnTakePhoto;
      Button btnTakePhoto = ViewBindings.findChildViewById(rootView, id);
      if (btnTakePhoto == null) {
        break missingId;
      }

      id = R.id.btnToySound;
      Button btnToySound = ViewBindings.findChildViewById(rootView, id);
      if (btnToySound == null) {
        break missingId;
      }

      id = R.id.viewFinder;
      PreviewView viewFinder = ViewBindings.findChildViewById(rootView, id);
      if (viewFinder == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btnTakePhoto, btnToySound,
          viewFinder);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}