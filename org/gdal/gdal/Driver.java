package org.gdal.gdal;

import java.util.Vector;
import org.gdal.gdalconst.gdalconstConstants;

public class Driver extends MajorObject {
  private transient long swigCPtr;

  protected Driver(long cPtr, boolean cMemoryOwn) {
    super(gdalJNI.Driver_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Driver obj) {
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


  private static Vector StringArrayToVector(String[] options)
  {
      if (options == null)
        return null;
      Vector v = new Vector();
      for(int i=0;i<options.length;i++)
        v.addElement(options[i]);
      return v;
  }

  public Dataset Create(String name, int xsize, int ysize, int bands, int eType, String[] options) {
    return Create(name, xsize, ysize, bands, eType, StringArrayToVector(options));
  }

  public Dataset Create(String name, int xsize, int ysize, int bands, String[] options) {
    return Create(name, xsize, ysize, bands, gdalconstConstants.GDT_Byte, StringArrayToVector(options));
  }

  public Dataset CreateCopy(String name, Dataset src, int strict, String[] options) {
    return CreateCopy(name, src, strict, StringArrayToVector(options), null);
  }

  public Dataset CreateCopy(String name, Dataset src, Vector options) {
    return CreateCopy(name, src, 1, options, null);
  }

  public Dataset CreateCopy(String name, Dataset src, String[] options) {
    return CreateCopy(name, src, 1, StringArrayToVector(options), null);
  }


  public String getShortName() {
    return gdalJNI.Driver_ShortName_get(swigCPtr, this);
  }

  public String getLongName() {
    return gdalJNI.Driver_LongName_get(swigCPtr, this);
  }

  public String getHelpTopic() {
    return gdalJNI.Driver_HelpTopic_get(swigCPtr, this);
  }

  public Dataset Create(String utf8_path, int xsize, int ysize, int bands, int eType, java.util.Vector options) {
    long cPtr = gdalJNI.Driver_Create__SWIG_0(swigCPtr, this, utf8_path, xsize, ysize, bands, eType, options);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public Dataset Create(String utf8_path, int xsize, int ysize, int bands, int eType) {
    long cPtr = gdalJNI.Driver_Create__SWIG_1(swigCPtr, this, utf8_path, xsize, ysize, bands, eType);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public Dataset Create(String utf8_path, int xsize, int ysize, int bands) {
    long cPtr = gdalJNI.Driver_Create__SWIG_2(swigCPtr, this, utf8_path, xsize, ysize, bands);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public Dataset Create(String utf8_path, int xsize, int ysize) {
    long cPtr = gdalJNI.Driver_Create__SWIG_3(swigCPtr, this, utf8_path, xsize, ysize);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public Dataset CreateMultiDimensional(String utf8_path, java.util.Vector root_group_options, java.util.Vector options) {
    long cPtr = gdalJNI.Driver_CreateMultiDimensional__SWIG_0(swigCPtr, this, utf8_path, root_group_options, options);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public Dataset CreateMultiDimensional(String utf8_path, java.util.Vector root_group_options) {
    long cPtr = gdalJNI.Driver_CreateMultiDimensional__SWIG_1(swigCPtr, this, utf8_path, root_group_options);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public Dataset CreateMultiDimensional(String utf8_path) {
    long cPtr = gdalJNI.Driver_CreateMultiDimensional__SWIG_2(swigCPtr, this, utf8_path);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public Dataset CreateCopy(String utf8_path, Dataset src, int strict, java.util.Vector options, ProgressCallback callback) {
    long cPtr = gdalJNI.Driver_CreateCopy__SWIG_0(swigCPtr, this, utf8_path, Dataset.getCPtr(src), src, strict, options, callback);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public Dataset CreateCopy(String utf8_path, Dataset src, int strict, java.util.Vector options) {
    long cPtr = gdalJNI.Driver_CreateCopy__SWIG_2(swigCPtr, this, utf8_path, Dataset.getCPtr(src), src, strict, options);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public Dataset CreateCopy(String utf8_path, Dataset src, int strict) {
    long cPtr = gdalJNI.Driver_CreateCopy__SWIG_3(swigCPtr, this, utf8_path, Dataset.getCPtr(src), src, strict);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public Dataset CreateCopy(String utf8_path, Dataset src) {
    long cPtr = gdalJNI.Driver_CreateCopy__SWIG_4(swigCPtr, this, utf8_path, Dataset.getCPtr(src), src);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public int Delete(String utf8_path) {
    return gdalJNI.Driver_Delete(swigCPtr, this, utf8_path);
  }

  public int Rename(String newName, String oldName) {
    return gdalJNI.Driver_Rename(swigCPtr, this, newName, oldName);
  }

  public int CopyFiles(String newName, String oldName) {
    return gdalJNI.Driver_CopyFiles(swigCPtr, this, newName, oldName);
  }

  public int Register() {
    return gdalJNI.Driver_Register(swigCPtr, this);
  }

  public void Deregister() {
    gdalJNI.Driver_Deregister(swigCPtr, this);
  }

}
