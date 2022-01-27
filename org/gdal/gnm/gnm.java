package org.gdal.gnm;

import org.gdal.osr.SpatialReference;
import org.gdal.gdal.MajorObject;
import org.gdal.ogr.Geometry;
import org.gdal.ogr.Feature;
import org.gdal.ogr.StyleTable;
import org.gdal.ogr.Layer;

public class gnm implements gnmConstants {
  public static void UseExceptions() {
    gnmJNI.UseExceptions();
  }

  public static void DontUseExceptions() {
    gnmJNI.DontUseExceptions();
  }

  public static boolean GetUseExceptions() {
    return gnmJNI.GetUseExceptions();
  }

}
