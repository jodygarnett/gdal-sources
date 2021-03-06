package org.gdal.gnm;

import org.gdal.osr.SpatialReference;
import org.gdal.gdal.MajorObject;
import org.gdal.ogr.Geometry;
import org.gdal.ogr.Feature;
import org.gdal.ogr.StyleTable;
import org.gdal.ogr.Layer;

public interface gnmConstants {
  public final static int GNM_EDGE_DIR_BOTH = gnmJNI.GNM_EDGE_DIR_BOTH_get();
  public final static int GNM_EDGE_DIR_SRCTOTGT = gnmJNI.GNM_EDGE_DIR_SRCTOTGT_get();
  public final static int GNM_EDGE_DIR_TGTTOSRC = gnmJNI.GNM_EDGE_DIR_TGTTOSRC_get();
}
