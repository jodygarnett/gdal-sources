package org.gdal.gnm;

import org.gdal.osr.SpatialReference;
import org.gdal.osr.CoordinateTransformation;
import org.gdal.gdal.MajorObject;
import org.gdal.ogr.Geometry;
import org.gdal.ogr.Feature;
import org.gdal.ogr.StyleTable;
import org.gdal.ogr.Layer;
import org.gdal.gdal.gdalJNI;

public class gnmJNI {
  public final static native void UseExceptions();
  public final static native void DontUseExceptions();
  public final static native boolean GetUseExceptions();


  static {
    gdalJNI.isAvailable();   // force gdalJNI static initializer to run and load library
  }

  public static boolean isAvailable() {
    return gdalJNI.isAvailable();
  }

  public final static native void delete_ProgressCallback(long jarg1);
  public final static native int ProgressCallback_run(long jarg1, ProgressCallback jarg1_, double jarg2, String jarg3);
  public final static native long new_ProgressCallback();
  public final static native long new_TermProgressCallback();
  public final static native int TermProgressCallback_run(long jarg1, TermProgressCallback jarg1_, double jarg2, String jarg3);
  public final static native void delete_TermProgressCallback(long jarg1);
  public final static native int GATDijkstraShortestPath_get();
  public final static native int GATKShortestPath_get();
  public final static native int GATConnectedComponents_get();
  public final static native int GNM_EDGE_DIR_BOTH_get();
  public final static native int GNM_EDGE_DIR_SRCTOTGT_get();
  public final static native int GNM_EDGE_DIR_TGTTOSRC_get();
  public final static native void delete_Network(long jarg1);
  public final static native int Network_GetVersion(long jarg1, Network jarg1_);
  public final static native String Network_GetName(long jarg1, Network jarg1_);
  public final static native long Network_GetFeatureByGlobalFID(long jarg1, Network jarg1_, long jarg2);
  public final static native long Network_GetPath__SWIG_0(long jarg1, Network jarg1_, long jarg2, long jarg3, int jarg4, java.util.Vector jarg5);
  public final static native long Network_GetPath__SWIG_1(long jarg1, Network jarg1_, long jarg2, long jarg3, int jarg4);
  public final static native int Network_DisconnectAll(long jarg1, Network jarg1_);
  public final static native String Network_GetProjection(long jarg1, Network jarg1_);
  public final static native String Network_GetProjectionRef(long jarg1, Network jarg1_);
  public final static native java.util.Vector Network_GetFileList(long jarg1, Network jarg1_);
  public final static native long Network_CreateLayer__SWIG_0(long jarg1, Network jarg1_, String jarg2, long jarg3, SpatialReference jarg3_, int jarg4, java.util.Vector jarg5);
  public final static native long Network_CreateLayer__SWIG_1(long jarg1, Network jarg1_, String jarg2, long jarg3, SpatialReference jarg3_, int jarg4);
  public final static native long Network_CreateLayer__SWIG_2(long jarg1, Network jarg1_, String jarg2, long jarg3, SpatialReference jarg3_);
  public final static native long Network_CreateLayer__SWIG_3(long jarg1, Network jarg1_, String jarg2);
  public final static native long Network_CopyLayer__SWIG_0(long jarg1, Network jarg1_, long jarg2, Layer jarg2_, String jarg3, java.util.Vector jarg4);
  public final static native long Network_CopyLayer__SWIG_1(long jarg1, Network jarg1_, long jarg2, Layer jarg2_, String jarg3);
  public final static native int Network_DeleteLayer(long jarg1, Network jarg1_, int jarg2);
  public final static native int Network_GetLayerCount(long jarg1, Network jarg1_);
  public final static native long Network_GetLayerByIndex(long jarg1, Network jarg1_, int jarg2);
  public final static native long Network_GetLayerByName(long jarg1, Network jarg1_, String jarg2);
  public final static native boolean Network_TestCapability(long jarg1, Network jarg1_, String jarg2);
  public final static native int Network_StartTransaction__SWIG_0(long jarg1, Network jarg1_, int jarg2);
  public final static native int Network_StartTransaction__SWIG_1(long jarg1, Network jarg1_);
  public final static native int Network_CommitTransaction(long jarg1, Network jarg1_);
  public final static native int Network_RollbackTransaction(long jarg1, Network jarg1_);
  public final static native void delete_GenericNetwork(long jarg1);
  public final static native int GenericNetwork_ConnectFeatures(long jarg1, GenericNetwork jarg1_, long jarg2, long jarg3, long jarg4, double jarg5, double jarg6, int jarg7);
  public final static native int GenericNetwork_DisconnectFeatures(long jarg1, GenericNetwork jarg1_, long jarg2, long jarg3, long jarg4);
  public final static native int GenericNetwork_DisconnectFeaturesWithId(long jarg1, GenericNetwork jarg1_, long jarg2);
  public final static native int GenericNetwork_ReconnectFeatures(long jarg1, GenericNetwork jarg1_, long jarg2, long jarg3, long jarg4, double jarg5, double jarg6, int jarg7);
  public final static native int GenericNetwork_CreateRule(long jarg1, GenericNetwork jarg1_, String jarg2);
  public final static native int GenericNetwork_DeleteAllRules(long jarg1, GenericNetwork jarg1_);
  public final static native int GenericNetwork_DeleteRule(long jarg1, GenericNetwork jarg1_, String jarg2);
  public final static native java.util.Vector GenericNetwork_GetRules(long jarg1, GenericNetwork jarg1_);
  public final static native int GenericNetwork_ConnectPointsByLines(long jarg1, GenericNetwork jarg1_, java.util.Vector jarg2, double jarg3, double jarg4, double jarg5, int jarg6);
  public final static native int GenericNetwork_ChangeBlockState(long jarg1, GenericNetwork jarg1_, long jarg2, boolean jarg3);
  public final static native int GenericNetwork_ChangeAllBlockState__SWIG_0(long jarg1, GenericNetwork jarg1_, boolean jarg2);
  public final static native int GenericNetwork_ChangeAllBlockState__SWIG_1(long jarg1, GenericNetwork jarg1_);
  public final static native long TermProgressCallback_SWIGUpcast(long jarg1);
  public final static native long Network_SWIGUpcast(long jarg1);
  public final static native long GenericNetwork_SWIGUpcast(long jarg1);
}
