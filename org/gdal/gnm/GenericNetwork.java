package org.gdal.gnm;

import org.gdal.osr.SpatialReference;
import org.gdal.gdal.MajorObject;
import org.gdal.ogr.Geometry;
import org.gdal.ogr.Feature;
import org.gdal.ogr.StyleTable;
import org.gdal.ogr.Layer;

public class GenericNetwork extends Network {
  private transient long swigCPtr;

  protected GenericNetwork(long cPtr, boolean cMemoryOwn) {
    super(gnmJNI.GenericNetwork_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GenericNetwork obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnmJNI.delete_GenericNetwork(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }


  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof GenericNetwork)
      equal = (((GenericNetwork)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }

  public int ConnectFeatures(long nSrcFID, long nTgtFID, long nConFID, double dfCost, double dfInvCost, int eDir) {
    return gnmJNI.GenericNetwork_ConnectFeatures(swigCPtr, this, nSrcFID, nTgtFID, nConFID, dfCost, dfInvCost, eDir);
  }

  public int DisconnectFeatures(long nSrcFID, long nTgtFID, long nConFID) {
    return gnmJNI.GenericNetwork_DisconnectFeatures(swigCPtr, this, nSrcFID, nTgtFID, nConFID);
  }

  public int DisconnectFeaturesWithId(long nFID) {
    return gnmJNI.GenericNetwork_DisconnectFeaturesWithId(swigCPtr, this, nFID);
  }

  public int ReconnectFeatures(long nSrcFID, long nTgtFID, long nConFID, double dfCost, double dfInvCost, int eDir) {
    return gnmJNI.GenericNetwork_ReconnectFeatures(swigCPtr, this, nSrcFID, nTgtFID, nConFID, dfCost, dfInvCost, eDir);
  }

  public int CreateRule(String pszRuleStr) {
    return gnmJNI.GenericNetwork_CreateRule(swigCPtr, this, pszRuleStr);
  }

  public int DeleteAllRules() {
    return gnmJNI.GenericNetwork_DeleteAllRules(swigCPtr, this);
  }

  public int DeleteRule(String pszRuleStr) {
    return gnmJNI.GenericNetwork_DeleteRule(swigCPtr, this, pszRuleStr);
  }

  public java.util.Vector GetRules() {
    return gnmJNI.GenericNetwork_GetRules(swigCPtr, this);
  }

  public int ConnectPointsByLines(java.util.Vector papszLayerList, double dfTolerance, double dfCost, double dfInvCost, int eDir) {
    return gnmJNI.GenericNetwork_ConnectPointsByLines(swigCPtr, this, papszLayerList, dfTolerance, dfCost, dfInvCost, eDir);
  }

  public int ChangeBlockState(long nFID, boolean bIsBlock) {
    return gnmJNI.GenericNetwork_ChangeBlockState(swigCPtr, this, nFID, bIsBlock);
  }

  public int ChangeAllBlockState(boolean bIsBlock) {
    return gnmJNI.GenericNetwork_ChangeAllBlockState__SWIG_0(swigCPtr, this, bIsBlock);
  }

  public int ChangeAllBlockState() {
    return gnmJNI.GenericNetwork_ChangeAllBlockState__SWIG_1(swigCPtr, this);
  }

}
