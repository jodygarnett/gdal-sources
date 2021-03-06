package org.gdal.gnm;

import org.gdal.osr.SpatialReference;
import org.gdal.gdal.MajorObject;
import org.gdal.ogr.Geometry;
import org.gdal.ogr.Feature;
import org.gdal.ogr.StyleTable;
import org.gdal.ogr.Layer;

public class Network extends MajorObject {
  private transient long swigCPtr;

  protected Network(long cPtr, boolean cMemoryOwn) {
    super(gnmJNI.Network_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Network obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnmJNI.delete_Network(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }


  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof Network)
      equal = (((Network)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }

  public int GetVersion() {
    return gnmJNI.Network_GetVersion(swigCPtr, this);
  }

  public String GetName() {
    return gnmJNI.Network_GetName(swigCPtr, this);
  }

  public Feature GetFeatureByGlobalFID(long GFID) {
    long cPtr = gnmJNI.Network_GetFeatureByGlobalFID(swigCPtr, this, GFID);
    return (cPtr == 0) ? null : new Feature(cPtr, true);
  }

  public Layer GetPath(long nStartFID, long nEndFID, GraphAlgorithm eAlgorithm, java.util.Vector options) {
    long cPtr = gnmJNI.Network_GetPath__SWIG_0(swigCPtr, this, nStartFID, nEndFID, eAlgorithm.swigValue(), options);
    return (cPtr == 0) ? null : new Layer(cPtr, true);
  }

  public Layer GetPath(long nStartFID, long nEndFID, GraphAlgorithm eAlgorithm) {
    long cPtr = gnmJNI.Network_GetPath__SWIG_1(swigCPtr, this, nStartFID, nEndFID, eAlgorithm.swigValue());
    return (cPtr == 0) ? null : new Layer(cPtr, true);
  }

  public int DisconnectAll() {
    return gnmJNI.Network_DisconnectAll(swigCPtr, this);
  }

  public String GetProjection() {
    return gnmJNI.Network_GetProjection(swigCPtr, this);
  }

  public String GetProjectionRef() {
    return gnmJNI.Network_GetProjectionRef(swigCPtr, this);
  }

  public java.util.Vector GetFileList() {
    return gnmJNI.Network_GetFileList(swigCPtr, this);
  }

  public Layer CreateLayer(String name, SpatialReference srs, int geom_type, java.util.Vector options) {
    long cPtr = gnmJNI.Network_CreateLayer__SWIG_0(swigCPtr, this, name, SpatialReference.getCPtr(srs), srs, geom_type, options);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer CreateLayer(String name, SpatialReference srs, int geom_type) {
    long cPtr = gnmJNI.Network_CreateLayer__SWIG_1(swigCPtr, this, name, SpatialReference.getCPtr(srs), srs, geom_type);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer CreateLayer(String name, SpatialReference srs) {
    long cPtr = gnmJNI.Network_CreateLayer__SWIG_2(swigCPtr, this, name, SpatialReference.getCPtr(srs), srs);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer CreateLayer(String name) {
    long cPtr = gnmJNI.Network_CreateLayer__SWIG_3(swigCPtr, this, name);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer CopyLayer(Layer src_layer, String new_name, java.util.Vector options) {
    long cPtr = gnmJNI.Network_CopyLayer__SWIG_0(swigCPtr, this, Layer.getCPtr(src_layer), src_layer, new_name, options);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer CopyLayer(Layer src_layer, String new_name) {
    long cPtr = gnmJNI.Network_CopyLayer__SWIG_1(swigCPtr, this, Layer.getCPtr(src_layer), src_layer, new_name);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public int DeleteLayer(int index) {
    return gnmJNI.Network_DeleteLayer(swigCPtr, this, index);
  }

  public int GetLayerCount() {
    return gnmJNI.Network_GetLayerCount(swigCPtr, this);
  }

  public Layer GetLayerByIndex(int index) {
    long cPtr = gnmJNI.Network_GetLayerByIndex(swigCPtr, this, index);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer GetLayerByName(String layer_name) {
    long cPtr = gnmJNI.Network_GetLayerByName(swigCPtr, this, layer_name);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public boolean TestCapability(String cap) {
    return gnmJNI.Network_TestCapability(swigCPtr, this, cap);
  }

  public int StartTransaction(int force) {
    return gnmJNI.Network_StartTransaction__SWIG_0(swigCPtr, this, force);
  }

  public int StartTransaction() {
    return gnmJNI.Network_StartTransaction__SWIG_1(swigCPtr, this);
  }

  public int CommitTransaction() {
    return gnmJNI.Network_CommitTransaction(swigCPtr, this);
  }

  public int RollbackTransaction() {
    return gnmJNI.Network_RollbackTransaction(swigCPtr, this);
  }

}
