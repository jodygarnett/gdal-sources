package org.gdal.gdal;

import org.gdal.osr.SpatialReference;
import org.gdal.ogr.Geometry;
import org.gdal.ogr.StyleTable;
import org.gdal.ogr.Layer;
import org.gdal.ogr.Feature;
import org.gdal.ogr.FieldDomain;

public class Dataset extends MajorObject {
  private transient long swigCPtr;

  protected Dataset(long cPtr, boolean cMemoryOwn) {
    super(gdalJNI.Dataset_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Dataset obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdalJNI.delete_Dataset(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }


  // Preferred name to match C++ API
  public int GetRasterXSize() { return getRasterXSize(); }

  // Preferred name to match C++ API
  public int GetRasterYSize() { return getRasterYSize(); }

  // Preferred name to match C++ API
  public int GetRasterCount() { return getRasterCount(); }

  public int BuildOverviews(int[] overviewlist, ProgressCallback callback) {
    return BuildOverviews(null, overviewlist, callback);
  }

  public int BuildOverviews(int[] overviewlist) {
    return BuildOverviews(null, overviewlist, null);
  }

  public java.util.Vector GetGCPs() {
      java.util.Vector gcps = new java.util.Vector();
      GetGCPs(gcps);
      return gcps;
  }

  public double[] GetGeoTransform() {
      double adfGeoTransform[] = new double[6];
      GetGeoTransform(adfGeoTransform);
      return adfGeoTransform;
  }

  public Layer GetLayer(int index)
  {
      return GetLayerByIndex(index);
  }

  public Layer GetLayer(String layerName)
  {
      return GetLayerByName(layerName);
  }

  public int getRasterXSize() {
    return gdalJNI.Dataset_RasterXSize_get(swigCPtr, this);
  }

  public int getRasterYSize() {
    return gdalJNI.Dataset_RasterYSize_get(swigCPtr, this);
  }

  public int getRasterCount() {
    return gdalJNI.Dataset_RasterCount_get(swigCPtr, this);
  }

  public Driver GetDriver() {
    long cPtr = gdalJNI.Dataset_GetDriver(swigCPtr, this);
    return (cPtr == 0) ? null : new Driver(cPtr, false);
  }

  public Band GetRasterBand(int nBand) {
    long cPtr = gdalJNI.Dataset_GetRasterBand(swigCPtr, this, nBand);
    Band ret = null;
    if (cPtr != 0) {
      ret = new Band(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Group GetRootGroup() {
    long cPtr = gdalJNI.Dataset_GetRootGroup(swigCPtr, this);
    return (cPtr == 0) ? null : new Group(cPtr, true);
  }

  public String GetProjection() {
    return gdalJNI.Dataset_GetProjection(swigCPtr, this);
  }

  public String GetProjectionRef() {
    return gdalJNI.Dataset_GetProjectionRef(swigCPtr, this);
  }

  public SpatialReference GetSpatialRef() {
    long cPtr = gdalJNI.Dataset_GetSpatialRef(swigCPtr, this);
    return (cPtr == 0) ? null : new SpatialReference(cPtr, true);
  }

  public int SetProjection(String prj) {
    return gdalJNI.Dataset_SetProjection(swigCPtr, this, prj);
  }

  public int SetSpatialRef(SpatialReference srs) {
    return gdalJNI.Dataset_SetSpatialRef(swigCPtr, this, SpatialReference.getCPtr(srs), srs);
  }

  public void GetGeoTransform(double[] argout) {
    gdalJNI.Dataset_GetGeoTransform(swigCPtr, this, argout);
  }

  public int SetGeoTransform(double[] argin) {
    return gdalJNI.Dataset_SetGeoTransform(swigCPtr, this, argin);
  }

  public int BuildOverviews(String resampling, int[] overviewlist, ProgressCallback callback) {
    return gdalJNI.Dataset_BuildOverviews__SWIG_0(swigCPtr, this, resampling, overviewlist, callback);
  }

  public int BuildOverviews(String resampling, int[] overviewlist) {
    return gdalJNI.Dataset_BuildOverviews__SWIG_2(swigCPtr, this, resampling, overviewlist);
  }

  public int GetGCPCount() {
    return gdalJNI.Dataset_GetGCPCount(swigCPtr, this);
  }

  public String GetGCPProjection() {
    return gdalJNI.Dataset_GetGCPProjection(swigCPtr, this);
  }

  public SpatialReference GetGCPSpatialRef() {
    long cPtr = gdalJNI.Dataset_GetGCPSpatialRef(swigCPtr, this);
    return (cPtr == 0) ? null : new SpatialReference(cPtr, true);
  }

  public void GetGCPs(java.util.Vector nGCPs) {
    gdalJNI.Dataset_GetGCPs(swigCPtr, this, nGCPs);
  }

  public int SetGCPs(GCP[] nGCPs, String pszGCPProjection) {
    return gdalJNI.Dataset_SetGCPs(swigCPtr, this, nGCPs, pszGCPProjection);
  }

  public int SetGCPs2(GCP[] nGCPs, SpatialReference hSRS) {
    return gdalJNI.Dataset_SetGCPs2(swigCPtr, this, nGCPs, SpatialReference.getCPtr(hSRS), hSRS);
  }

  public void FlushCache() {
    gdalJNI.Dataset_FlushCache(swigCPtr, this);
  }

  public int AddBand(int datatype, java.util.Vector options) {
    return gdalJNI.Dataset_AddBand__SWIG_0(swigCPtr, this, datatype, options);
  }

  public int AddBand(int datatype) {
    return gdalJNI.Dataset_AddBand__SWIG_1(swigCPtr, this, datatype);
  }

  public int AddBand() {
    return gdalJNI.Dataset_AddBand__SWIG_2(swigCPtr, this);
  }

  public int CreateMaskBand(int nFlags) {
    return gdalJNI.Dataset_CreateMaskBand(swigCPtr, this, nFlags);
  }

  public java.util.Vector GetFileList() {
    return gdalJNI.Dataset_GetFileList(swigCPtr, this);
  }

  public int AdviseRead(int xoff, int yoff, int xsize, int ysize, SWIGTYPE_p_int buf_xsize, SWIGTYPE_p_int buf_ysize, SWIGTYPE_p_int buf_type, int[] band_list, java.util.Vector options) {
    return gdalJNI.Dataset_AdviseRead__SWIG_0(swigCPtr, this, xoff, yoff, xsize, ysize, SWIGTYPE_p_int.getCPtr(buf_xsize), SWIGTYPE_p_int.getCPtr(buf_ysize), SWIGTYPE_p_int.getCPtr(buf_type), band_list, options);
  }

  public int AdviseRead(int xoff, int yoff, int xsize, int ysize, SWIGTYPE_p_int buf_xsize, SWIGTYPE_p_int buf_ysize, SWIGTYPE_p_int buf_type, int[] band_list) {
    return gdalJNI.Dataset_AdviseRead__SWIG_1(swigCPtr, this, xoff, yoff, xsize, ysize, SWIGTYPE_p_int.getCPtr(buf_xsize), SWIGTYPE_p_int.getCPtr(buf_ysize), SWIGTYPE_p_int.getCPtr(buf_type), band_list);
  }

  public int AdviseRead(int xoff, int yoff, int xsize, int ysize, SWIGTYPE_p_int buf_xsize, SWIGTYPE_p_int buf_ysize, SWIGTYPE_p_int buf_type) {
    return gdalJNI.Dataset_AdviseRead__SWIG_3(swigCPtr, this, xoff, yoff, xsize, ysize, SWIGTYPE_p_int.getCPtr(buf_xsize), SWIGTYPE_p_int.getCPtr(buf_ysize), SWIGTYPE_p_int.getCPtr(buf_type));
  }

  public int AdviseRead(int xoff, int yoff, int xsize, int ysize, SWIGTYPE_p_int buf_xsize, SWIGTYPE_p_int buf_ysize) {
    return gdalJNI.Dataset_AdviseRead__SWIG_4(swigCPtr, this, xoff, yoff, xsize, ysize, SWIGTYPE_p_int.getCPtr(buf_xsize), SWIGTYPE_p_int.getCPtr(buf_ysize));
  }

  public int AdviseRead(int xoff, int yoff, int xsize, int ysize, SWIGTYPE_p_int buf_xsize) {
    return gdalJNI.Dataset_AdviseRead__SWIG_5(swigCPtr, this, xoff, yoff, xsize, ysize, SWIGTYPE_p_int.getCPtr(buf_xsize));
  }

  public int AdviseRead(int xoff, int yoff, int xsize, int ysize) {
    return gdalJNI.Dataset_AdviseRead__SWIG_6(swigCPtr, this, xoff, yoff, xsize, ysize);
  }

  public Layer CreateLayer(String name, SpatialReference srs, int geom_type, java.util.Vector options) {
    long cPtr = gdalJNI.Dataset_CreateLayer__SWIG_0(swigCPtr, this, name, SpatialReference.getCPtr(srs), srs, geom_type, options);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer CreateLayer(String name, SpatialReference srs, int geom_type) {
    long cPtr = gdalJNI.Dataset_CreateLayer__SWIG_1(swigCPtr, this, name, SpatialReference.getCPtr(srs), srs, geom_type);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer CreateLayer(String name, SpatialReference srs) {
    long cPtr = gdalJNI.Dataset_CreateLayer__SWIG_2(swigCPtr, this, name, SpatialReference.getCPtr(srs), srs);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer CreateLayer(String name) {
    long cPtr = gdalJNI.Dataset_CreateLayer__SWIG_3(swigCPtr, this, name);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer CopyLayer(Layer src_layer, String new_name, java.util.Vector options) {
    long cPtr = gdalJNI.Dataset_CopyLayer__SWIG_0(swigCPtr, this, Layer.getCPtr(src_layer), src_layer, new_name, options);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer CopyLayer(Layer src_layer, String new_name) {
    long cPtr = gdalJNI.Dataset_CopyLayer__SWIG_1(swigCPtr, this, Layer.getCPtr(src_layer), src_layer, new_name);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public int DeleteLayer(int index) {
    return gdalJNI.Dataset_DeleteLayer(swigCPtr, this, index);
  }

  public int GetLayerCount() {
    return gdalJNI.Dataset_GetLayerCount(swigCPtr, this);
  }

  public boolean IsLayerPrivate(int index) {
    return gdalJNI.Dataset_IsLayerPrivate(swigCPtr, this, index);
  }

  public Layer GetLayerByIndex(int index) {
    long cPtr = gdalJNI.Dataset_GetLayerByIndex(swigCPtr, this, index);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer GetLayerByName(String layer_name) {
    long cPtr = gdalJNI.Dataset_GetLayerByName(swigCPtr, this, layer_name);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public void ResetReading() {
    gdalJNI.Dataset_ResetReading(swigCPtr, this);
  }

  public Feature GetNextFeature() {
    long cPtr = gdalJNI.Dataset_GetNextFeature(swigCPtr, this);
    return (cPtr == 0) ? null : new Feature(cPtr, true);
  }

  public boolean TestCapability(String cap) {
    return gdalJNI.Dataset_TestCapability(swigCPtr, this, cap);
  }

  public Layer ExecuteSQL(String statement, Geometry spatialFilter, String dialect) {
    long cPtr = gdalJNI.Dataset_ExecuteSQL__SWIG_0(swigCPtr, this, statement, Geometry.getCPtr(spatialFilter), spatialFilter, dialect);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer ExecuteSQL(String statement, Geometry spatialFilter) {
    long cPtr = gdalJNI.Dataset_ExecuteSQL__SWIG_1(swigCPtr, this, statement, Geometry.getCPtr(spatialFilter), spatialFilter);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Layer ExecuteSQL(String statement) {
    long cPtr = gdalJNI.Dataset_ExecuteSQL__SWIG_2(swigCPtr, this, statement);
    Layer ret = null;
    if (cPtr != 0) {
      ret = new Layer(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public void ReleaseResultSet(Layer layer) {
    gdalJNI.Dataset_ReleaseResultSet(swigCPtr, this, Layer.getCPtrAndDisown(layer), layer);
  }

  public StyleTable GetStyleTable() {
    long cPtr = gdalJNI.Dataset_GetStyleTable(swigCPtr, this);
    return (cPtr == 0) ? null : new StyleTable(cPtr, false);
  }

  public void SetStyleTable(StyleTable table) {
    gdalJNI.Dataset_SetStyleTable(swigCPtr, this, StyleTable.getCPtr(table), table);
  }

  public int AbortSQL() {
    return gdalJNI.Dataset_AbortSQL(swigCPtr, this);
  }

  public int StartTransaction(int force) {
    return gdalJNI.Dataset_StartTransaction__SWIG_0(swigCPtr, this, force);
  }

  public int StartTransaction() {
    return gdalJNI.Dataset_StartTransaction__SWIG_1(swigCPtr, this);
  }

  public int CommitTransaction() {
    return gdalJNI.Dataset_CommitTransaction(swigCPtr, this);
  }

  public int RollbackTransaction() {
    return gdalJNI.Dataset_RollbackTransaction(swigCPtr, this);
  }

  public void ClearStatistics() {
    gdalJNI.Dataset_ClearStatistics(swigCPtr, this);
  }

  public FieldDomain GetFieldDomain(String name) {
    long cPtr = gdalJNI.Dataset_GetFieldDomain(swigCPtr, this, name);
    return (cPtr == 0) ? null : new FieldDomain(cPtr, false);
  }

  public boolean AddFieldDomain(FieldDomain fieldDomain) {
    return gdalJNI.Dataset_AddFieldDomain(swigCPtr, this, FieldDomain.getCPtr(fieldDomain), fieldDomain);
  }

  public int ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, java.nio.ByteBuffer nioBuffer, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
    return gdalJNI.Dataset_ReadRaster_Direct__SWIG_0(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, band_list, nPixelSpace, nLineSpace, nBandSpace);
  }

  public int ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, java.nio.ByteBuffer nioBuffer, int[] band_list, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Dataset_ReadRaster_Direct__SWIG_1(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, band_list, nPixelSpace, nLineSpace);
  }

  public int ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, java.nio.ByteBuffer nioBuffer, int[] band_list, int nPixelSpace) {
    return gdalJNI.Dataset_ReadRaster_Direct__SWIG_2(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, band_list, nPixelSpace);
  }

  public int ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, java.nio.ByteBuffer nioBuffer, int[] band_list) {
    return gdalJNI.Dataset_ReadRaster_Direct__SWIG_3(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, band_list);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayOut, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
    return gdalJNI.Dataset_ReadRaster__SWIG_0(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace, nLineSpace, nBandSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayOut, int[] band_list, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Dataset_ReadRaster__SWIG_1(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace, nLineSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayOut, int[] band_list, int nPixelSpace) {
    return gdalJNI.Dataset_ReadRaster__SWIG_2(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayOut, int[] band_list) {
    return gdalJNI.Dataset_ReadRaster__SWIG_3(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayOut, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
    return gdalJNI.Dataset_ReadRaster__SWIG_4(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace, nLineSpace, nBandSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayOut, int[] band_list, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Dataset_ReadRaster__SWIG_5(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace, nLineSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayOut, int[] band_list, int nPixelSpace) {
    return gdalJNI.Dataset_ReadRaster__SWIG_6(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayOut, int[] band_list) {
    return gdalJNI.Dataset_ReadRaster__SWIG_7(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayOut, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
    return gdalJNI.Dataset_ReadRaster__SWIG_8(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace, nLineSpace, nBandSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayOut, int[] band_list, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Dataset_ReadRaster__SWIG_9(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace, nLineSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayOut, int[] band_list, int nPixelSpace) {
    return gdalJNI.Dataset_ReadRaster__SWIG_10(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayOut, int[] band_list) {
    return gdalJNI.Dataset_ReadRaster__SWIG_11(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayOut, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
    return gdalJNI.Dataset_ReadRaster__SWIG_12(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace, nLineSpace, nBandSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayOut, int[] band_list, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Dataset_ReadRaster__SWIG_13(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace, nLineSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayOut, int[] band_list, int nPixelSpace) {
    return gdalJNI.Dataset_ReadRaster__SWIG_14(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayOut, int[] band_list) {
    return gdalJNI.Dataset_ReadRaster__SWIG_15(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayOut, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
    return gdalJNI.Dataset_ReadRaster__SWIG_16(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace, nLineSpace, nBandSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayOut, int[] band_list, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Dataset_ReadRaster__SWIG_17(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace, nLineSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayOut, int[] band_list, int nPixelSpace) {
    return gdalJNI.Dataset_ReadRaster__SWIG_18(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayOut, int[] band_list) {
    return gdalJNI.Dataset_ReadRaster__SWIG_19(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list);
  }

  public int WriteRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, java.nio.ByteBuffer nioBuffer, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
    return gdalJNI.Dataset_WriteRaster_Direct__SWIG_0(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, band_list, nPixelSpace, nLineSpace, nBandSpace);
  }

  public int WriteRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, java.nio.ByteBuffer nioBuffer, int[] band_list, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Dataset_WriteRaster_Direct__SWIG_1(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, band_list, nPixelSpace, nLineSpace);
  }

  public int WriteRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, java.nio.ByteBuffer nioBuffer, int[] band_list, int nPixelSpace) {
    return gdalJNI.Dataset_WriteRaster_Direct__SWIG_2(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, band_list, nPixelSpace);
  }

  public int WriteRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, java.nio.ByteBuffer nioBuffer, int[] band_list) {
    return gdalJNI.Dataset_WriteRaster_Direct__SWIG_3(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, band_list);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayIn, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
    return gdalJNI.Dataset_WriteRaster__SWIG_0(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace, nLineSpace, nBandSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayIn, int[] band_list, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Dataset_WriteRaster__SWIG_1(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace, nLineSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayIn, int[] band_list, int nPixelSpace) {
    return gdalJNI.Dataset_WriteRaster__SWIG_2(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayIn, int[] band_list) {
    return gdalJNI.Dataset_WriteRaster__SWIG_3(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayIn, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
    return gdalJNI.Dataset_WriteRaster__SWIG_4(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace, nLineSpace, nBandSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayIn, int[] band_list, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Dataset_WriteRaster__SWIG_5(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace, nLineSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayIn, int[] band_list, int nPixelSpace) {
    return gdalJNI.Dataset_WriteRaster__SWIG_6(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayIn, int[] band_list) {
    return gdalJNI.Dataset_WriteRaster__SWIG_7(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayIn, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
    return gdalJNI.Dataset_WriteRaster__SWIG_8(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace, nLineSpace, nBandSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayIn, int[] band_list, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Dataset_WriteRaster__SWIG_9(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace, nLineSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayIn, int[] band_list, int nPixelSpace) {
    return gdalJNI.Dataset_WriteRaster__SWIG_10(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayIn, int[] band_list) {
    return gdalJNI.Dataset_WriteRaster__SWIG_11(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayIn, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
    return gdalJNI.Dataset_WriteRaster__SWIG_12(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace, nLineSpace, nBandSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayIn, int[] band_list, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Dataset_WriteRaster__SWIG_13(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace, nLineSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayIn, int[] band_list, int nPixelSpace) {
    return gdalJNI.Dataset_WriteRaster__SWIG_14(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayIn, int[] band_list) {
    return gdalJNI.Dataset_WriteRaster__SWIG_15(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayIn, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
    return gdalJNI.Dataset_WriteRaster__SWIG_16(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace, nLineSpace, nBandSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayIn, int[] band_list, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Dataset_WriteRaster__SWIG_17(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace, nLineSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayIn, int[] band_list, int nPixelSpace) {
    return gdalJNI.Dataset_WriteRaster__SWIG_18(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayIn, int[] band_list) {
    return gdalJNI.Dataset_WriteRaster__SWIG_19(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list);
  }

}
