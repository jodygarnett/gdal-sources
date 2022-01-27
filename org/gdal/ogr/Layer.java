package org.gdal.ogr;

import org.gdal.osr.SpatialReference;
import org.gdal.gdal.MajorObject;

public class Layer extends MajorObject {
  private long swigCPtr;

  public Layer(long cPtr, boolean cMemoryOwn) {
    super(ogrJNI.Layer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Layer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  private Object parentReference;


  public static long getCPtrAndDisown(Layer obj) {
    if (obj != null)
    {
        obj.swigCMemOwn= false;
        obj.parentReference = null;
    }
    return getCPtr(obj);
  }

  /* Ensure that the GC doesn't collect any parent instance set from Java */
  public void addReference(Object reference) {
    parentReference = reference;
  }

  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof Layer)
      equal = (((Layer)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }

  public double[] GetExtent(boolean force)
  {
      double[] argout = new double[4];
      try
      {
          int ret = GetExtent(argout, (force) ? 1 : 0);
          return (ret == 0) ? argout : null;
      }
      catch(RuntimeException e)
      {
          return null;
      }
  }

  public double[] GetExtent()
  {
      return GetExtent(true);
  }

  public int GetRefCount() {
    return ogrJNI.Layer_GetRefCount(swigCPtr, this);
  }

  public void SetSpatialFilter(Geometry filter) {
    ogrJNI.Layer_SetSpatialFilter__SWIG_0(swigCPtr, this, Geometry.getCPtr(filter), filter);
  }

  public void SetSpatialFilterRect(double minx, double miny, double maxx, double maxy) {
    ogrJNI.Layer_SetSpatialFilterRect__SWIG_0(swigCPtr, this, minx, miny, maxx, maxy);
  }

  public void SetSpatialFilter(int iGeomField, Geometry filter) {
    ogrJNI.Layer_SetSpatialFilter__SWIG_1(swigCPtr, this, iGeomField, Geometry.getCPtr(filter), filter);
  }

  public void SetSpatialFilterRect(int iGeomField, double minx, double miny, double maxx, double maxy) {
    ogrJNI.Layer_SetSpatialFilterRect__SWIG_1(swigCPtr, this, iGeomField, minx, miny, maxx, maxy);
  }

  public Geometry GetSpatialFilter() {
    long cPtr = ogrJNI.Layer_GetSpatialFilter(swigCPtr, this);
    Geometry ret = null;
    if (cPtr != 0) {
      ret = new Geometry(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public int SetAttributeFilter(String filter_string) {
    return ogrJNI.Layer_SetAttributeFilter(swigCPtr, this, filter_string);
  }

  public void ResetReading() {
    ogrJNI.Layer_ResetReading(swigCPtr, this);
  }

  public String GetName() {
    return ogrJNI.Layer_GetName(swigCPtr, this);
  }

  public int GetGeomType() {
    return ogrJNI.Layer_GetGeomType(swigCPtr, this);
  }

  public String GetGeometryColumn() {
    return ogrJNI.Layer_GetGeometryColumn(swigCPtr, this);
  }

  public String GetFIDColumn() {
    return ogrJNI.Layer_GetFIDColumn(swigCPtr, this);
  }

  public Feature GetFeature(long fid) {
    long cPtr = ogrJNI.Layer_GetFeature(swigCPtr, this, fid);
    return (cPtr == 0) ? null : new Feature(cPtr, true);
  }

  public Feature GetNextFeature() {
    long cPtr = ogrJNI.Layer_GetNextFeature(swigCPtr, this);
    return (cPtr == 0) ? null : new Feature(cPtr, true);
  }

  public int SetNextByIndex(long new_index) {
    return ogrJNI.Layer_SetNextByIndex(swigCPtr, this, new_index);
  }

  public int SetFeature(Feature feature) {
    return ogrJNI.Layer_SetFeature(swigCPtr, this, Feature.getCPtr(feature), feature);
  }

  public int CreateFeature(Feature feature) {
    return ogrJNI.Layer_CreateFeature(swigCPtr, this, Feature.getCPtr(feature), feature);
  }

  public int DeleteFeature(long fid) {
    return ogrJNI.Layer_DeleteFeature(swigCPtr, this, fid);
  }

  public int SyncToDisk() {
    return ogrJNI.Layer_SyncToDisk(swigCPtr, this);
  }

  public FeatureDefn GetLayerDefn() {
    long cPtr = ogrJNI.Layer_GetLayerDefn(swigCPtr, this);
    FeatureDefn ret = null;
    if (cPtr != 0) {
      ret = new FeatureDefn(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public long GetFeatureCount(int force) {
    return ogrJNI.Layer_GetFeatureCount__SWIG_0(swigCPtr, this, force);
  }

  public long GetFeatureCount() {
    return ogrJNI.Layer_GetFeatureCount__SWIG_1(swigCPtr, this);
  }

  public int GetExtent(double[] argout, int force) {
    return ogrJNI.Layer_GetExtent(swigCPtr, this, argout, force);
  }

  public boolean TestCapability(String cap) {
    return ogrJNI.Layer_TestCapability(swigCPtr, this, cap);
  }

  public int CreateField(FieldDefn field_def, int approx_ok) {
    return ogrJNI.Layer_CreateField__SWIG_0(swigCPtr, this, FieldDefn.getCPtr(field_def), field_def, approx_ok);
  }

  public int CreateField(FieldDefn field_def) {
    return ogrJNI.Layer_CreateField__SWIG_1(swigCPtr, this, FieldDefn.getCPtr(field_def), field_def);
  }

  public int DeleteField(int iField) {
    return ogrJNI.Layer_DeleteField(swigCPtr, this, iField);
  }

  public int ReorderField(int iOldFieldPos, int iNewFieldPos) {
    return ogrJNI.Layer_ReorderField(swigCPtr, this, iOldFieldPos, iNewFieldPos);
  }

  public int ReorderFields(int[] nList) {
    return ogrJNI.Layer_ReorderFields(swigCPtr, this, nList);
  }

  public int AlterFieldDefn(int iField, FieldDefn field_def, int nFlags) {
    return ogrJNI.Layer_AlterFieldDefn(swigCPtr, this, iField, FieldDefn.getCPtr(field_def), field_def, nFlags);
  }

  public int CreateGeomField(GeomFieldDefn field_def, int approx_ok) {
    return ogrJNI.Layer_CreateGeomField__SWIG_0(swigCPtr, this, GeomFieldDefn.getCPtr(field_def), field_def, approx_ok);
  }

  public int CreateGeomField(GeomFieldDefn field_def) {
    return ogrJNI.Layer_CreateGeomField__SWIG_1(swigCPtr, this, GeomFieldDefn.getCPtr(field_def), field_def);
  }

  public int StartTransaction() {
    return ogrJNI.Layer_StartTransaction(swigCPtr, this);
  }

  public int CommitTransaction() {
    return ogrJNI.Layer_CommitTransaction(swigCPtr, this);
  }

  public int RollbackTransaction() {
    return ogrJNI.Layer_RollbackTransaction(swigCPtr, this);
  }

  public int FindFieldIndex(String pszFieldName, int bExactMatch) {
    return ogrJNI.Layer_FindFieldIndex(swigCPtr, this, pszFieldName, bExactMatch);
  }

  public SpatialReference GetSpatialRef() {
    long cPtr = ogrJNI.Layer_GetSpatialRef(swigCPtr, this);
    return (cPtr == 0) ? null : new SpatialReference(cPtr, true);
  }

  public long GetFeaturesRead() {
    return ogrJNI.Layer_GetFeaturesRead(swigCPtr, this);
  }

  public int SetIgnoredFields(java.util.Vector options) {
    return ogrJNI.Layer_SetIgnoredFields(swigCPtr, this, options);
  }

  public int Intersection(Layer method_layer, Layer result_layer, java.util.Vector options, ProgressCallback callback) {
    return ogrJNI.Layer_Intersection__SWIG_0(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer, options, callback);
  }

  public int Intersection(Layer method_layer, Layer result_layer, java.util.Vector options) {
    return ogrJNI.Layer_Intersection__SWIG_2(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer, options);
  }

  public int Intersection(Layer method_layer, Layer result_layer) {
    return ogrJNI.Layer_Intersection__SWIG_3(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer);
  }

  public int Union(Layer method_layer, Layer result_layer, java.util.Vector options, ProgressCallback callback) {
    return ogrJNI.Layer_Union__SWIG_0(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer, options, callback);
  }

  public int Union(Layer method_layer, Layer result_layer, java.util.Vector options) {
    return ogrJNI.Layer_Union__SWIG_2(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer, options);
  }

  public int Union(Layer method_layer, Layer result_layer) {
    return ogrJNI.Layer_Union__SWIG_3(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer);
  }

  public int SymDifference(Layer method_layer, Layer result_layer, java.util.Vector options, ProgressCallback callback) {
    return ogrJNI.Layer_SymDifference__SWIG_0(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer, options, callback);
  }

  public int SymDifference(Layer method_layer, Layer result_layer, java.util.Vector options) {
    return ogrJNI.Layer_SymDifference__SWIG_2(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer, options);
  }

  public int SymDifference(Layer method_layer, Layer result_layer) {
    return ogrJNI.Layer_SymDifference__SWIG_3(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer);
  }

  public int Identity(Layer method_layer, Layer result_layer, java.util.Vector options, ProgressCallback callback) {
    return ogrJNI.Layer_Identity__SWIG_0(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer, options, callback);
  }

  public int Identity(Layer method_layer, Layer result_layer, java.util.Vector options) {
    return ogrJNI.Layer_Identity__SWIG_2(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer, options);
  }

  public int Identity(Layer method_layer, Layer result_layer) {
    return ogrJNI.Layer_Identity__SWIG_3(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer);
  }

  public int Update(Layer method_layer, Layer result_layer, java.util.Vector options, ProgressCallback callback) {
    return ogrJNI.Layer_Update__SWIG_0(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer, options, callback);
  }

  public int Update(Layer method_layer, Layer result_layer, java.util.Vector options) {
    return ogrJNI.Layer_Update__SWIG_2(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer, options);
  }

  public int Update(Layer method_layer, Layer result_layer) {
    return ogrJNI.Layer_Update__SWIG_3(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer);
  }

  public int Clip(Layer method_layer, Layer result_layer, java.util.Vector options, ProgressCallback callback) {
    return ogrJNI.Layer_Clip__SWIG_0(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer, options, callback);
  }

  public int Clip(Layer method_layer, Layer result_layer, java.util.Vector options) {
    return ogrJNI.Layer_Clip__SWIG_2(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer, options);
  }

  public int Clip(Layer method_layer, Layer result_layer) {
    return ogrJNI.Layer_Clip__SWIG_3(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer);
  }

  public int Erase(Layer method_layer, Layer result_layer, java.util.Vector options, ProgressCallback callback) {
    return ogrJNI.Layer_Erase__SWIG_0(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer, options, callback);
  }

  public int Erase(Layer method_layer, Layer result_layer, java.util.Vector options) {
    return ogrJNI.Layer_Erase__SWIG_2(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer, options);
  }

  public int Erase(Layer method_layer, Layer result_layer) {
    return ogrJNI.Layer_Erase__SWIG_3(swigCPtr, this, Layer.getCPtr(method_layer), method_layer, Layer.getCPtr(result_layer), result_layer);
  }

  public StyleTable GetStyleTable() {
    long cPtr = ogrJNI.Layer_GetStyleTable(swigCPtr, this);
    return (cPtr == 0) ? null : new StyleTable(cPtr, false);
  }

  public void SetStyleTable(StyleTable table) {
    ogrJNI.Layer_SetStyleTable(swigCPtr, this, StyleTable.getCPtr(table), table);
  }

}
