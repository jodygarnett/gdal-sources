package org.gdal.ogr;

import org.gdal.ogr.FeatureNative;

public class Feature implements Cloneable {
  private long swigCPtr;
  private FeatureNative nativeObject;

  public Feature(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCPtr = cPtr;
    if (cMemoryOwn)
        nativeObject = new FeatureNative(this, cPtr);
  }

  public static long getCPtr(Feature obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public void delete() 
   {
      if (nativeObject != null)
      {
        nativeObject.delete();
        nativeObject = null;
      }
   }



  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof Feature)
      equal = Equal((Feature)obj);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }

  public Object clone()
  {
      return Clone();
  }

  public Feature(FeatureDefn feature_def) {
    this(ogrJNI.new_Feature(FeatureDefn.getCPtr(feature_def), feature_def), true);
  }

  public FeatureDefn GetDefnRef() {
    long cPtr = ogrJNI.Feature_GetDefnRef(swigCPtr, this);
    FeatureDefn ret = null;
    if (cPtr != 0) {
      ret = new FeatureDefn(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public int SetGeometry(Geometry geom) {
    return ogrJNI.Feature_SetGeometry(swigCPtr, this, Geometry.getCPtr(geom), geom);
  }

  public int SetGeometryDirectly(Geometry geom) {
    int ret = ogrJNI.Feature_SetGeometryDirectly(swigCPtr, this, Geometry.getCPtrAndDisown(geom), geom);
    if (geom != null)
        geom.addReference(this);
    return ret;
  }

  public Geometry GetGeometryRef() {
    long cPtr = ogrJNI.Feature_GetGeometryRef(swigCPtr, this);
    Geometry ret = null;
    if (cPtr != 0) {
      ret = new Geometry(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public int SetGeomField(int iField, Geometry geom) {
    return ogrJNI.Feature_SetGeomField__SWIG_0(swigCPtr, this, iField, Geometry.getCPtr(geom), geom);
  }

  public int SetGeomField(String field_name, Geometry geom) {
    return ogrJNI.Feature_SetGeomField__SWIG_1(swigCPtr, this, field_name, Geometry.getCPtr(geom), geom);
  }

  public int SetGeomFieldDirectly(int iField, Geometry geom) {
    return ogrJNI.Feature_SetGeomFieldDirectly__SWIG_0(swigCPtr, this, iField, Geometry.getCPtrAndDisown(geom), geom);
  }

  public int SetGeomFieldDirectly(String field_name, Geometry geom) {
    return ogrJNI.Feature_SetGeomFieldDirectly__SWIG_1(swigCPtr, this, field_name, Geometry.getCPtrAndDisown(geom), geom);
  }

  public Geometry GetGeomFieldRef(int iField) {
    long cPtr = ogrJNI.Feature_GetGeomFieldRef__SWIG_0(swigCPtr, this, iField);
    Geometry ret = null;
    if (cPtr != 0) {
      ret = new Geometry(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Geometry GetGeomFieldRef(String field_name) {
    long cPtr = ogrJNI.Feature_GetGeomFieldRef__SWIG_1(swigCPtr, this, field_name);
    Geometry ret = null;
    if (cPtr != 0) {
      ret = new Geometry(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Feature Clone() {
    long cPtr = ogrJNI.Feature_Clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Feature(cPtr, true);
  }

  public boolean Equal(Feature feature) {
    return ogrJNI.Feature_Equal(swigCPtr, this, Feature.getCPtr(feature), feature);
  }

  public int GetFieldCount() {
    return ogrJNI.Feature_GetFieldCount(swigCPtr, this);
  }

  public FieldDefn GetFieldDefnRef(int id) {
    long cPtr = ogrJNI.Feature_GetFieldDefnRef__SWIG_0(swigCPtr, this, id);
    FieldDefn ret = null;
    if (cPtr != 0) {
      ret = new FieldDefn(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public FieldDefn GetFieldDefnRef(String field_name) {
    long cPtr = ogrJNI.Feature_GetFieldDefnRef__SWIG_1(swigCPtr, this, field_name);
    FieldDefn ret = null;
    if (cPtr != 0) {
      ret = new FieldDefn(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public int GetGeomFieldCount() {
    return ogrJNI.Feature_GetGeomFieldCount(swigCPtr, this);
  }

  public GeomFieldDefn GetGeomFieldDefnRef(int id) {
    long cPtr = ogrJNI.Feature_GetGeomFieldDefnRef__SWIG_0(swigCPtr, this, id);
    return (cPtr == 0) ? null : new GeomFieldDefn(cPtr, false);
  }

  public GeomFieldDefn GetGeomFieldDefnRef(String field_name) {
    long cPtr = ogrJNI.Feature_GetGeomFieldDefnRef__SWIG_1(swigCPtr, this, field_name);
    return (cPtr == 0) ? null : new GeomFieldDefn(cPtr, false);
  }

  public String GetFieldAsString(int id) {
    return ogrJNI.Feature_GetFieldAsString__SWIG_0(swigCPtr, this, id);
  }

  public String GetFieldAsString(String field_name) {
    return ogrJNI.Feature_GetFieldAsString__SWIG_1(swigCPtr, this, field_name);
  }

  public int GetFieldAsInteger(int id) {
    return ogrJNI.Feature_GetFieldAsInteger__SWIG_0(swigCPtr, this, id);
  }

  public int GetFieldAsInteger(String field_name) {
    return ogrJNI.Feature_GetFieldAsInteger__SWIG_1(swigCPtr, this, field_name);
  }

  public long GetFieldAsInteger64(int id) {
    return ogrJNI.Feature_GetFieldAsInteger64__SWIG_0(swigCPtr, this, id);
  }

  public long GetFieldAsInteger64(String field_name) {
    return ogrJNI.Feature_GetFieldAsInteger64__SWIG_1(swigCPtr, this, field_name);
  }

  public double GetFieldAsDouble(int id) {
    return ogrJNI.Feature_GetFieldAsDouble__SWIG_0(swigCPtr, this, id);
  }

  public double GetFieldAsDouble(String field_name) {
    return ogrJNI.Feature_GetFieldAsDouble__SWIG_1(swigCPtr, this, field_name);
  }

  public void GetFieldAsDateTime(int id, int[] pnYear, int[] pnMonth, int[] pnDay, int[] pnHour, int[] pnMinute, float[] pfSecond, int[] pnTZFlag) {
    ogrJNI.Feature_GetFieldAsDateTime__SWIG_0(swigCPtr, this, id, pnYear, pnMonth, pnDay, pnHour, pnMinute, pfSecond, pnTZFlag);
  }

  public void GetFieldAsDateTime(String field_name, int[] pnYear, int[] pnMonth, int[] pnDay, int[] pnHour, int[] pnMinute, float[] pfSecond, int[] pnTZFlag) {
    ogrJNI.Feature_GetFieldAsDateTime__SWIG_1(swigCPtr, this, field_name, pnYear, pnMonth, pnDay, pnHour, pnMinute, pfSecond, pnTZFlag);
  }

  public int[] GetFieldAsIntegerList(int id) {
    return ogrJNI.Feature_GetFieldAsIntegerList(swigCPtr, this, id);
  }

  public double[] GetFieldAsDoubleList(int id) {
    return ogrJNI.Feature_GetFieldAsDoubleList(swigCPtr, this, id);
  }

  public String[] GetFieldAsStringList(int id) {
    return ogrJNI.Feature_GetFieldAsStringList(swigCPtr, this, id);
  }

  public byte[] GetFieldAsBinary(int id) {
    return ogrJNI.Feature_GetFieldAsBinary__SWIG_0(swigCPtr, this, id);
  }

  public byte[] GetFieldAsBinary(String field_name) {
    return ogrJNI.Feature_GetFieldAsBinary__SWIG_1(swigCPtr, this, field_name);
  }

  public boolean IsFieldSet(int id) {
    return ogrJNI.Feature_IsFieldSet__SWIG_0(swigCPtr, this, id);
  }

  public boolean IsFieldSet(String field_name) {
    return ogrJNI.Feature_IsFieldSet__SWIG_1(swigCPtr, this, field_name);
  }

  public boolean IsFieldNull(int id) {
    return ogrJNI.Feature_IsFieldNull__SWIG_0(swigCPtr, this, id);
  }

  public boolean IsFieldNull(String field_name) {
    return ogrJNI.Feature_IsFieldNull__SWIG_1(swigCPtr, this, field_name);
  }

  public boolean IsFieldSetAndNotNull(int id) {
    return ogrJNI.Feature_IsFieldSetAndNotNull__SWIG_0(swigCPtr, this, id);
  }

  public boolean IsFieldSetAndNotNull(String field_name) {
    return ogrJNI.Feature_IsFieldSetAndNotNull__SWIG_1(swigCPtr, this, field_name);
  }

  public int GetFieldIndex(String field_name) {
    return ogrJNI.Feature_GetFieldIndex(swigCPtr, this, field_name);
  }

  public int GetGeomFieldIndex(String field_name) {
    return ogrJNI.Feature_GetGeomFieldIndex(swigCPtr, this, field_name);
  }

  public long GetFID() {
    return ogrJNI.Feature_GetFID(swigCPtr, this);
  }

  public int SetFID(long fid) {
    return ogrJNI.Feature_SetFID(swigCPtr, this, fid);
  }

  public void DumpReadable() {
    ogrJNI.Feature_DumpReadable(swigCPtr, this);
  }

  public void UnsetField(int id) {
    ogrJNI.Feature_UnsetField__SWIG_0(swigCPtr, this, id);
  }

  public void UnsetField(String field_name) {
    ogrJNI.Feature_UnsetField__SWIG_1(swigCPtr, this, field_name);
  }

  public void SetFieldNull(int id) {
    ogrJNI.Feature_SetFieldNull__SWIG_0(swigCPtr, this, id);
  }

  public void SetFieldNull(String field_name) {
    ogrJNI.Feature_SetFieldNull__SWIG_1(swigCPtr, this, field_name);
  }

  public void SetField(int id, String value) {
    ogrJNI.Feature_SetField__SWIG_0(swigCPtr, this, id, value);
  }

  public void SetField(String field_name, String value) {
    ogrJNI.Feature_SetField__SWIG_1(swigCPtr, this, field_name, value);
  }

  public void SetFieldInteger64(int id, long value) {
    ogrJNI.Feature_SetFieldInteger64(swigCPtr, this, id, value);
  }

  public void SetField(int id, int value) {
    ogrJNI.Feature_SetField__SWIG_2(swigCPtr, this, id, value);
  }

  public void SetField(String field_name, int value) {
    ogrJNI.Feature_SetField__SWIG_3(swigCPtr, this, field_name, value);
  }

  public void SetField(int id, double value) {
    ogrJNI.Feature_SetField__SWIG_4(swigCPtr, this, id, value);
  }

  public void SetField(String field_name, double value) {
    ogrJNI.Feature_SetField__SWIG_5(swigCPtr, this, field_name, value);
  }

  public void SetField(int id, int year, int month, int day, int hour, int minute, float second, int tzflag) {
    ogrJNI.Feature_SetField__SWIG_6(swigCPtr, this, id, year, month, day, hour, minute, second, tzflag);
  }

  public void SetField(String field_name, int year, int month, int day, int hour, int minute, float second, int tzflag) {
    ogrJNI.Feature_SetField__SWIG_7(swigCPtr, this, field_name, year, month, day, hour, minute, second, tzflag);
  }

  public void SetFieldIntegerList(int id, int[] nList) {
    ogrJNI.Feature_SetFieldIntegerList(swigCPtr, this, id, nList);
  }

  public void SetFieldDoubleList(int id, double[] nList) {
    ogrJNI.Feature_SetFieldDoubleList(swigCPtr, this, id, nList);
  }

  public void SetFieldStringList(int id, java.util.Vector pList) {
    ogrJNI.Feature_SetFieldStringList(swigCPtr, this, id, pList);
  }

  public void SetFieldBinaryFromHexString(int id, String pszValue) {
    ogrJNI.Feature_SetFieldBinaryFromHexString__SWIG_0(swigCPtr, this, id, pszValue);
  }

  public void SetFieldBinaryFromHexString(String field_name, String pszValue) {
    ogrJNI.Feature_SetFieldBinaryFromHexString__SWIG_1(swigCPtr, this, field_name, pszValue);
  }

  public int SetFrom(Feature other, int forgiving) {
    return ogrJNI.Feature_SetFrom__SWIG_0(swigCPtr, this, Feature.getCPtr(other), other, forgiving);
  }

  public int SetFrom(Feature other) {
    return ogrJNI.Feature_SetFrom__SWIG_1(swigCPtr, this, Feature.getCPtr(other), other);
  }

  public int SetFromWithMap(Feature other, int forgiving, int[] nList) {
    return ogrJNI.Feature_SetFromWithMap(swigCPtr, this, Feature.getCPtr(other), other, forgiving, nList);
  }

  public String GetStyleString() {
    return ogrJNI.Feature_GetStyleString(swigCPtr, this);
  }

  public void SetStyleString(String the_string) {
    ogrJNI.Feature_SetStyleString(swigCPtr, this, the_string);
  }

  public int GetFieldType(int id) {
    return ogrJNI.Feature_GetFieldType__SWIG_0(swigCPtr, this, id);
  }

  public int GetFieldType(String field_name) {
    return ogrJNI.Feature_GetFieldType__SWIG_1(swigCPtr, this, field_name);
  }

  public int Validate(int flags, int bEmitError) {
    return ogrJNI.Feature_Validate__SWIG_0(swigCPtr, this, flags, bEmitError);
  }

  public int Validate(int flags) {
    return ogrJNI.Feature_Validate__SWIG_1(swigCPtr, this, flags);
  }

  public int Validate() {
    return ogrJNI.Feature_Validate__SWIG_2(swigCPtr, this);
  }

  public void FillUnsetWithDefault(int bNotNullableOnly, java.util.Vector options) {
    ogrJNI.Feature_FillUnsetWithDefault__SWIG_0(swigCPtr, this, bNotNullableOnly, options);
  }

  public void FillUnsetWithDefault(int bNotNullableOnly) {
    ogrJNI.Feature_FillUnsetWithDefault__SWIG_1(swigCPtr, this, bNotNullableOnly);
  }

  public void FillUnsetWithDefault() {
    ogrJNI.Feature_FillUnsetWithDefault__SWIG_2(swigCPtr, this);
  }

  public String GetNativeData() {
    return ogrJNI.Feature_GetNativeData(swigCPtr, this);
  }

  public String GetNativeMediaType() {
    return ogrJNI.Feature_GetNativeMediaType(swigCPtr, this);
  }

  public void SetNativeData(String nativeData) {
    ogrJNI.Feature_SetNativeData(swigCPtr, this, nativeData);
  }

  public void SetNativeMediaType(String nativeMediaType) {
    ogrJNI.Feature_SetNativeMediaType(swigCPtr, this, nativeMediaType);
  }

}
