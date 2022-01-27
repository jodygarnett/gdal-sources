package org.gdal.ogr;

import org.gdal.osr.SpatialReference;
import org.gdal.gdal.MajorObject;

public class DataSource extends MajorObject {
  private transient long swigCPtr;

  protected DataSource(long cPtr, boolean cMemoryOwn) {
    super(ogrJNI.DataSource_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DataSource obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ogrJNI.delete_DataSource(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }


  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof DataSource)
      equal = (((DataSource)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }

  public Layer GetLayer(int index)
  {
      return GetLayerByIndex(index);
  }

  public Layer GetLayer(String layerName)
  {
      return GetLayerByName(layerName);
  }


  public String getName() {
    return ogrJNI.DataSource_name_get(swigCPtr, this);
  }

  public int GetRefCount() {
    return ogrJNI.DataSource_GetRefCount(swigCPtr, this);
  }

  public int GetSummaryRefCount() {
    return ogrJNI.DataSource_GetSummaryRefCount(swigCPtr, this);
  }

  public int GetLayerCount() {
    return ogrJNI.DataSource_GetLayerCount(swigCPtr, this);
  }

  public Driver GetDriver() {
    long cPtr = ogrJNI.DataSource_GetDriver(swigCPtr, this);
    return (cPtr == 0) ? null : new Driver(cPtr, false);
  }

  public String GetName() {
    return ogrJNI.DataSource_GetName(swigCPtr, this);
  }

  public int DeleteLayer(int index) {
    return ogrJNI.DataSource_DeleteLayer(swigCPtr, this, index);
  }

  public int SyncToDisk() {
    return ogrJNI.DataSource_SyncToDisk(swigCPtr, this);
  }

  public void FlushCache() {
    ogrJNI.DataSource_FlushCache(swigCPtr, this);
  }

  public Layer CreateLayer(String name, SpatialReference srs, int geom_type, java.util.Vector options) {
    long cPtr = ogrJNI.DataSource_CreateLayer__SWIG_0(swigCPtr, this, name, SpatialReference.getCPtr(srs), srs, geom_type, options);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer CreateLayer(String name, SpatialReference srs, int geom_type) {
    long cPtr = ogrJNI.DataSource_CreateLayer__SWIG_1(swigCPtr, this, name, SpatialReference.getCPtr(srs), srs, geom_type);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer CreateLayer(String name, SpatialReference srs) {
    long cPtr = ogrJNI.DataSource_CreateLayer__SWIG_2(swigCPtr, this, name, SpatialReference.getCPtr(srs), srs);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer CreateLayer(String name) {
    long cPtr = ogrJNI.DataSource_CreateLayer__SWIG_3(swigCPtr, this, name);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer CopyLayer(Layer src_layer, String new_name, java.util.Vector options) {
    long cPtr = ogrJNI.DataSource_CopyLayer__SWIG_0(swigCPtr, this, Layer.getCPtr(src_layer), src_layer, new_name, options);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer CopyLayer(Layer src_layer, String new_name) {
    long cPtr = ogrJNI.DataSource_CopyLayer__SWIG_1(swigCPtr, this, Layer.getCPtr(src_layer), src_layer, new_name);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer GetLayerByIndex(int index) {
    long cPtr = ogrJNI.DataSource_GetLayerByIndex(swigCPtr, this, index);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer GetLayerByName(String layer_name) {
    long cPtr = ogrJNI.DataSource_GetLayerByName(swigCPtr, this, layer_name);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public boolean TestCapability(String cap) {
    return ogrJNI.DataSource_TestCapability(swigCPtr, this, cap);
  }

  public Layer ExecuteSQL(String statement, Geometry spatialFilter, String dialect) {
    long cPtr = ogrJNI.DataSource_ExecuteSQL__SWIG_0(swigCPtr, this, statement, Geometry.getCPtr(spatialFilter), spatialFilter, dialect);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer ExecuteSQL(String statement, Geometry spatialFilter) {
    long cPtr = ogrJNI.DataSource_ExecuteSQL__SWIG_1(swigCPtr, this, statement, Geometry.getCPtr(spatialFilter), spatialFilter);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer ExecuteSQL(String statement) {
    long cPtr = ogrJNI.DataSource_ExecuteSQL__SWIG_2(swigCPtr, this, statement);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public void ReleaseResultSet(Layer layer) {
    ogrJNI.DataSource_ReleaseResultSet(swigCPtr, this, Layer.getCPtrAndDisown(layer), layer);
  }

  public StyleTable GetStyleTable() {
    long cPtr = ogrJNI.DataSource_GetStyleTable(swigCPtr, this);
    return (cPtr == 0) ? null : new StyleTable(cPtr, false);
  }

  public void SetStyleTable(StyleTable table) {
    ogrJNI.DataSource_SetStyleTable(swigCPtr, this, StyleTable.getCPtr(table), table);
  }

  public int StartTransaction(int force) {
    return ogrJNI.DataSource_StartTransaction__SWIG_0(swigCPtr, this, force);
  }

  public int StartTransaction() {
    return ogrJNI.DataSource_StartTransaction__SWIG_1(swigCPtr, this);
  }

  public int CommitTransaction() {
    return ogrJNI.DataSource_CommitTransaction(swigCPtr, this);
  }

  public int RollbackTransaction() {
    return ogrJNI.DataSource_RollbackTransaction(swigCPtr, this);
  }

}
