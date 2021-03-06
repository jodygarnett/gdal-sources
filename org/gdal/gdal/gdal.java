package org.gdal.gdal;

import org.gdal.osr.SpatialReference;
import org.gdal.ogr.Geometry;
import org.gdal.ogr.StyleTable;
import org.gdal.ogr.Layer;
import org.gdal.ogr.Feature;
import org.gdal.ogr.FieldDomain;

public class gdal {
  public static void UseExceptions() {
    gdalJNI.UseExceptions();
  }

  public static void DontUseExceptions() {
    gdalJNI.DontUseExceptions();
  }

  public static boolean GetUseExceptions() {
    return gdalJNI.GetUseExceptions();
  }



    /* Uninstanciable class */
    private gdal()
    {
    }

    public static String[] GeneralCmdLineProcessor(String[] args, int nOptions)
    {
        java.util.Vector vArgs = new java.util.Vector();
        int i;
        for(i=0;i<args.length;i++)
            vArgs.addElement(args[i]);

        vArgs = GeneralCmdLineProcessor(vArgs, nOptions);
        java.util.Enumeration eArgs = vArgs.elements();
        args = new String[vArgs.size()];
        i = 0;
        while(eArgs.hasMoreElements())
        {
            String arg = (String)eArgs.nextElement();
            args[i++] = arg;
        }

        return args;
    }

    public static String[] GeneralCmdLineProcessor(String[] args)
    {
        return GeneralCmdLineProcessor(args, 0);
    }

    public static double[] InvGeoTransform(double[] gt_in)
    {
      double gt_out[] = new double[6];
      if (InvGeoTransform(gt_in, gt_out) == 1)
        return gt_out;
      else
        return null;
    }

  public static void Debug(String msg_class, String message) {
    gdalJNI.Debug(msg_class, message);
  }

  public static int SetErrorHandler(SWIGTYPE_p_CPLErrorHandler pfnErrorHandler, SWIGTYPE_p_void user_data) {
    return gdalJNI.SetErrorHandler__SWIG_0(SWIGTYPE_p_CPLErrorHandler.getCPtr(pfnErrorHandler), SWIGTYPE_p_void.getCPtr(user_data));
  }

  public static int SetErrorHandler(SWIGTYPE_p_CPLErrorHandler pfnErrorHandler) {
    return gdalJNI.SetErrorHandler__SWIG_1(SWIGTYPE_p_CPLErrorHandler.getCPtr(pfnErrorHandler));
  }

  public static int SetErrorHandler() {
    return gdalJNI.SetErrorHandler__SWIG_2();
  }

  public static void SetCurrentErrorHandlerCatchDebug(int bCatchDebug) {
    gdalJNI.SetCurrentErrorHandlerCatchDebug(bCatchDebug);
  }

  public static int PushErrorHandler(String pszCallbackName) {
    return gdalJNI.PushErrorHandler__SWIG_0(pszCallbackName);
  }

  public static int PushErrorHandler() {
    return gdalJNI.PushErrorHandler__SWIG_1();
  }

  public static void Error(int msg_class, int err_code, String msg) {
    gdalJNI.Error(msg_class, err_code, msg);
  }

  public static String GOA2GetAuthorizationURL(String pszScope) {
    return gdalJNI.GOA2GetAuthorizationURL(pszScope);
  }

  public static String GOA2GetRefreshToken(String pszAuthToken, String pszScope) {
    return gdalJNI.GOA2GetRefreshToken(pszAuthToken, pszScope);
  }

  public static String GOA2GetAccessToken(String pszRefreshToken, String pszScope) {
    return gdalJNI.GOA2GetAccessToken(pszRefreshToken, pszScope);
  }

  public static void PopErrorHandler() {
    gdalJNI.PopErrorHandler();
  }

  public static void ErrorReset() {
    gdalJNI.ErrorReset();
  }

  public static String EscapeString(byte[] len, int scheme) {
    return gdalJNI.EscapeString__SWIG_0(len, scheme);
  }

  public static String EscapeString(String str, int scheme) {
    return gdalJNI.EscapeString__SWIG_1(str, scheme);
  }

  public static int GetLastErrorNo() {
    return gdalJNI.GetLastErrorNo();
  }

  public static int GetLastErrorType() {
    return gdalJNI.GetLastErrorType();
  }

  public static String GetLastErrorMsg() {
    return gdalJNI.GetLastErrorMsg();
  }

  public static long GetErrorCounter() {
    return gdalJNI.GetErrorCounter();
  }

  public static int VSIGetLastErrorNo() {
    return gdalJNI.VSIGetLastErrorNo();
  }

  public static String VSIGetLastErrorMsg() {
    return gdalJNI.VSIGetLastErrorMsg();
  }

  public static void VSIErrorReset() {
    gdalJNI.VSIErrorReset();
  }

  public static void PushFinderLocation(String utf8_path) {
    gdalJNI.PushFinderLocation(utf8_path);
  }

  public static void PopFinderLocation() {
    gdalJNI.PopFinderLocation();
  }

  public static void FinderClean() {
    gdalJNI.FinderClean();
  }

  public static String FindFile(String pszClass, String utf8_path) {
    return gdalJNI.FindFile(pszClass, utf8_path);
  }

  public static java.util.Vector ReadDir(String utf8_path, int nMaxFiles) {
    return gdalJNI.ReadDir__SWIG_0(utf8_path, nMaxFiles);
  }

  public static java.util.Vector ReadDir(String utf8_path) {
    return gdalJNI.ReadDir__SWIG_1(utf8_path);
  }

  public static java.util.Vector ReadDirRecursive(String utf8_path) {
    return gdalJNI.ReadDirRecursive(utf8_path);
  }

  public static void SetConfigOption(String pszKey, String pszValue) {
    gdalJNI.SetConfigOption(pszKey, pszValue);
  }

  public static void SetThreadLocalConfigOption(String pszKey, String pszValue) {
    gdalJNI.SetThreadLocalConfigOption(pszKey, pszValue);
  }

  public static String GetConfigOption(String pszKey, String pszDefault) {
    return gdalJNI.GetConfigOption__SWIG_0(pszKey, pszDefault);
  }

  public static String GetConfigOption(String pszKey) {
    return gdalJNI.GetConfigOption__SWIG_1(pszKey);
  }

  public static String GetThreadLocalConfigOption(String pszKey, String pszDefault) {
    return gdalJNI.GetThreadLocalConfigOption__SWIG_0(pszKey, pszDefault);
  }

  public static String GetThreadLocalConfigOption(String pszKey) {
    return gdalJNI.GetThreadLocalConfigOption__SWIG_1(pszKey);
  }

  public static String CPLBinaryToHex(byte[] nBytes) {
    return gdalJNI.CPLBinaryToHex(nBytes);
  }

  public static byte[] CPLHexToBinary(String pszHex) {
    return gdalJNI.CPLHexToBinary(pszHex);
  }

  public static void FileFromMemBuffer(String utf8_path, byte[] nBytes) {
    gdalJNI.FileFromMemBuffer(utf8_path, nBytes);
  }

  public static int Unlink(String utf8_path) {
    return gdalJNI.Unlink(utf8_path);
  }

  public static boolean UnlinkBatch(java.util.Vector files) {
    return gdalJNI.UnlinkBatch(files);
  }

  public static int HasThreadSupport() {
    return gdalJNI.HasThreadSupport();
  }

  public static int Mkdir(String utf8_path, int mode) {
    return gdalJNI.Mkdir(utf8_path, mode);
  }

  public static int Rmdir(String utf8_path) {
    return gdalJNI.Rmdir(utf8_path);
  }

  public static int MkdirRecursive(String utf8_path, int mode) {
    return gdalJNI.MkdirRecursive(utf8_path, mode);
  }

  public static int RmdirRecursive(String utf8_path) {
    return gdalJNI.RmdirRecursive(utf8_path);
  }

  public static int Rename(String pszOld, String pszNew) {
    return gdalJNI.Rename(pszOld, pszNew);
  }

  public static String GetActualURL(String utf8_path) {
    return gdalJNI.GetActualURL(utf8_path);
  }

  public static String GetSignedURL(String utf8_path, java.util.Vector options) {
    return gdalJNI.GetSignedURL__SWIG_0(utf8_path, options);
  }

  public static String GetSignedURL(String utf8_path) {
    return gdalJNI.GetSignedURL__SWIG_1(utf8_path);
  }

  public static java.util.Vector GetFileSystemsPrefixes() {
    return gdalJNI.GetFileSystemsPrefixes();
  }

  public static String GetFileSystemOptions(String utf8_path) {
    return gdalJNI.GetFileSystemOptions(utf8_path);
  }

  public static java.util.Vector ParseCommandLine(String utf8_path) {
    return gdalJNI.ParseCommandLine(utf8_path);
  }

  public static double GDAL_GCP_GCPX_get(GCP gcp) {
    return gdalJNI.GDAL_GCP_GCPX_get(GCP.getCPtr(gcp), gcp);
  }

  public static void GDAL_GCP_GCPX_set(GCP gcp, double dfGCPX) {
    gdalJNI.GDAL_GCP_GCPX_set(GCP.getCPtr(gcp), gcp, dfGCPX);
  }

  public static double GDAL_GCP_GCPY_get(GCP gcp) {
    return gdalJNI.GDAL_GCP_GCPY_get(GCP.getCPtr(gcp), gcp);
  }

  public static void GDAL_GCP_GCPY_set(GCP gcp, double dfGCPY) {
    gdalJNI.GDAL_GCP_GCPY_set(GCP.getCPtr(gcp), gcp, dfGCPY);
  }

  public static double GDAL_GCP_GCPZ_get(GCP gcp) {
    return gdalJNI.GDAL_GCP_GCPZ_get(GCP.getCPtr(gcp), gcp);
  }

  public static void GDAL_GCP_GCPZ_set(GCP gcp, double dfGCPZ) {
    gdalJNI.GDAL_GCP_GCPZ_set(GCP.getCPtr(gcp), gcp, dfGCPZ);
  }

  public static double GDAL_GCP_GCPPixel_get(GCP gcp) {
    return gdalJNI.GDAL_GCP_GCPPixel_get(GCP.getCPtr(gcp), gcp);
  }

  public static void GDAL_GCP_GCPPixel_set(GCP gcp, double dfGCPPixel) {
    gdalJNI.GDAL_GCP_GCPPixel_set(GCP.getCPtr(gcp), gcp, dfGCPPixel);
  }

  public static double GDAL_GCP_GCPLine_get(GCP gcp) {
    return gdalJNI.GDAL_GCP_GCPLine_get(GCP.getCPtr(gcp), gcp);
  }

  public static void GDAL_GCP_GCPLine_set(GCP gcp, double dfGCPLine) {
    gdalJNI.GDAL_GCP_GCPLine_set(GCP.getCPtr(gcp), gcp, dfGCPLine);
  }

  public static String GDAL_GCP_Info_get(GCP gcp) {
    return gdalJNI.GDAL_GCP_Info_get(GCP.getCPtr(gcp), gcp);
  }

  public static void GDAL_GCP_Info_set(GCP gcp, String pszInfo) {
    gdalJNI.GDAL_GCP_Info_set(GCP.getCPtr(gcp), gcp, pszInfo);
  }

  public static String GDAL_GCP_Id_get(GCP gcp) {
    return gdalJNI.GDAL_GCP_Id_get(GCP.getCPtr(gcp), gcp);
  }

  public static void GDAL_GCP_Id_set(GCP gcp, String pszId) {
    gdalJNI.GDAL_GCP_Id_set(GCP.getCPtr(gcp), gcp, pszId);
  }

  public static int GCPsToGeoTransform(GCP[] nGCPs, double[] argout, int bApproxOK) {
    return gdalJNI.GCPsToGeoTransform__SWIG_0(nGCPs, argout, bApproxOK);
  }

  public static int GCPsToGeoTransform(GCP[] nGCPs, double[] argout) {
    return gdalJNI.GCPsToGeoTransform__SWIG_1(nGCPs, argout);
  }

  public static int ComputeMedianCutPCT(Band red, Band green, Band blue, int num_colors, ColorTable colors, ProgressCallback callback) {
    return gdalJNI.ComputeMedianCutPCT__SWIG_0(Band.getCPtr(red), red, Band.getCPtr(green), green, Band.getCPtr(blue), blue, num_colors, ColorTable.getCPtr(colors), colors, callback);
  }

  public static int ComputeMedianCutPCT(Band red, Band green, Band blue, int num_colors, ColorTable colors) {
    return gdalJNI.ComputeMedianCutPCT__SWIG_2(Band.getCPtr(red), red, Band.getCPtr(green), green, Band.getCPtr(blue), blue, num_colors, ColorTable.getCPtr(colors), colors);
  }

  public static int DitherRGB2PCT(Band red, Band green, Band blue, Band target, ColorTable colors, ProgressCallback callback) {
    return gdalJNI.DitherRGB2PCT__SWIG_0(Band.getCPtr(red), red, Band.getCPtr(green), green, Band.getCPtr(blue), blue, Band.getCPtr(target), target, ColorTable.getCPtr(colors), colors, callback);
  }

  public static int DitherRGB2PCT(Band red, Band green, Band blue, Band target, ColorTable colors) {
    return gdalJNI.DitherRGB2PCT__SWIG_2(Band.getCPtr(red), red, Band.getCPtr(green), green, Band.getCPtr(blue), blue, Band.getCPtr(target), target, ColorTable.getCPtr(colors), colors);
  }

  public static int ReprojectImage(Dataset src_ds, Dataset dst_ds, String src_wkt, String dst_wkt, int eResampleAlg, double WarpMemoryLimit, double maxerror, ProgressCallback callback, java.util.Vector options) {
    return gdalJNI.ReprojectImage__SWIG_0(Dataset.getCPtr(src_ds), src_ds, Dataset.getCPtr(dst_ds), dst_ds, src_wkt, dst_wkt, eResampleAlg, WarpMemoryLimit, maxerror, callback, options);
  }

  public static int ReprojectImage(Dataset src_ds, Dataset dst_ds, String src_wkt, String dst_wkt, int eResampleAlg, double WarpMemoryLimit, double maxerror, ProgressCallback callback) {
    return gdalJNI.ReprojectImage__SWIG_1(Dataset.getCPtr(src_ds), src_ds, Dataset.getCPtr(dst_ds), dst_ds, src_wkt, dst_wkt, eResampleAlg, WarpMemoryLimit, maxerror, callback);
  }

  public static int ReprojectImage(Dataset src_ds, Dataset dst_ds, String src_wkt, String dst_wkt, int eResampleAlg, double WarpMemoryLimit, double maxerror) {
    return gdalJNI.ReprojectImage__SWIG_3(Dataset.getCPtr(src_ds), src_ds, Dataset.getCPtr(dst_ds), dst_ds, src_wkt, dst_wkt, eResampleAlg, WarpMemoryLimit, maxerror);
  }

  public static int ReprojectImage(Dataset src_ds, Dataset dst_ds, String src_wkt, String dst_wkt, int eResampleAlg, double WarpMemoryLimit) {
    return gdalJNI.ReprojectImage__SWIG_4(Dataset.getCPtr(src_ds), src_ds, Dataset.getCPtr(dst_ds), dst_ds, src_wkt, dst_wkt, eResampleAlg, WarpMemoryLimit);
  }

  public static int ReprojectImage(Dataset src_ds, Dataset dst_ds, String src_wkt, String dst_wkt, int eResampleAlg) {
    return gdalJNI.ReprojectImage__SWIG_5(Dataset.getCPtr(src_ds), src_ds, Dataset.getCPtr(dst_ds), dst_ds, src_wkt, dst_wkt, eResampleAlg);
  }

  public static int ReprojectImage(Dataset src_ds, Dataset dst_ds, String src_wkt, String dst_wkt) {
    return gdalJNI.ReprojectImage__SWIG_6(Dataset.getCPtr(src_ds), src_ds, Dataset.getCPtr(dst_ds), dst_ds, src_wkt, dst_wkt);
  }

  public static int ReprojectImage(Dataset src_ds, Dataset dst_ds, String src_wkt) {
    return gdalJNI.ReprojectImage__SWIG_7(Dataset.getCPtr(src_ds), src_ds, Dataset.getCPtr(dst_ds), dst_ds, src_wkt);
  }

  public static int ReprojectImage(Dataset src_ds, Dataset dst_ds) {
    return gdalJNI.ReprojectImage__SWIG_8(Dataset.getCPtr(src_ds), src_ds, Dataset.getCPtr(dst_ds), dst_ds);
  }

  public static int ComputeProximity(Band srcBand, Band proximityBand, java.util.Vector options, ProgressCallback callback) {
    return gdalJNI.ComputeProximity__SWIG_0(Band.getCPtr(srcBand), srcBand, Band.getCPtr(proximityBand), proximityBand, options, callback);
  }

  public static int ComputeProximity(Band srcBand, Band proximityBand, java.util.Vector options) {
    return gdalJNI.ComputeProximity__SWIG_2(Band.getCPtr(srcBand), srcBand, Band.getCPtr(proximityBand), proximityBand, options);
  }

  public static int ComputeProximity(Band srcBand, Band proximityBand) {
    return gdalJNI.ComputeProximity__SWIG_3(Band.getCPtr(srcBand), srcBand, Band.getCPtr(proximityBand), proximityBand);
  }

  public static int RasterizeLayer(Dataset dataset, int[] bands, Layer layer, double[] burn_values, java.util.Vector options, ProgressCallback callback) {
    return gdalJNI.RasterizeLayer__SWIG_0(Dataset.getCPtr(dataset), dataset, bands, Layer.getCPtr(layer), layer, burn_values, options, callback);
  }

  public static int RasterizeLayer(Dataset dataset, int[] bands, Layer layer, double[] burn_values, java.util.Vector options) {
    return gdalJNI.RasterizeLayer__SWIG_2(Dataset.getCPtr(dataset), dataset, bands, Layer.getCPtr(layer), layer, burn_values, options);
  }

  public static int RasterizeLayer(Dataset dataset, int[] bands, Layer layer, double[] burn_values) {
    return gdalJNI.RasterizeLayer__SWIG_3(Dataset.getCPtr(dataset), dataset, bands, Layer.getCPtr(layer), layer, burn_values);
  }

  public static int RasterizeLayer(Dataset dataset, int[] bands, Layer layer) {
    return gdalJNI.RasterizeLayer__SWIG_5(Dataset.getCPtr(dataset), dataset, bands, Layer.getCPtr(layer), layer);
  }

  public static int Polygonize(Band srcBand, Band maskBand, Layer outLayer, int iPixValField, java.util.Vector options, ProgressCallback callback) {
    return gdalJNI.Polygonize__SWIG_0(Band.getCPtr(srcBand), srcBand, Band.getCPtr(maskBand), maskBand, Layer.getCPtr(outLayer), outLayer, iPixValField, options, callback);
  }

  public static int Polygonize(Band srcBand, Band maskBand, Layer outLayer, int iPixValField, java.util.Vector options) {
    return gdalJNI.Polygonize__SWIG_2(Band.getCPtr(srcBand), srcBand, Band.getCPtr(maskBand), maskBand, Layer.getCPtr(outLayer), outLayer, iPixValField, options);
  }

  public static int Polygonize(Band srcBand, Band maskBand, Layer outLayer, int iPixValField) {
    return gdalJNI.Polygonize__SWIG_3(Band.getCPtr(srcBand), srcBand, Band.getCPtr(maskBand), maskBand, Layer.getCPtr(outLayer), outLayer, iPixValField);
  }

  public static int FPolygonize(Band srcBand, Band maskBand, Layer outLayer, int iPixValField, java.util.Vector options, ProgressCallback callback) {
    return gdalJNI.FPolygonize__SWIG_0(Band.getCPtr(srcBand), srcBand, Band.getCPtr(maskBand), maskBand, Layer.getCPtr(outLayer), outLayer, iPixValField, options, callback);
  }

  public static int FPolygonize(Band srcBand, Band maskBand, Layer outLayer, int iPixValField, java.util.Vector options) {
    return gdalJNI.FPolygonize__SWIG_2(Band.getCPtr(srcBand), srcBand, Band.getCPtr(maskBand), maskBand, Layer.getCPtr(outLayer), outLayer, iPixValField, options);
  }

  public static int FPolygonize(Band srcBand, Band maskBand, Layer outLayer, int iPixValField) {
    return gdalJNI.FPolygonize__SWIG_3(Band.getCPtr(srcBand), srcBand, Band.getCPtr(maskBand), maskBand, Layer.getCPtr(outLayer), outLayer, iPixValField);
  }

  public static int FillNodata(Band targetBand, Band maskBand, double maxSearchDist, int smoothingIterations, java.util.Vector options, ProgressCallback callback) {
    return gdalJNI.FillNodata__SWIG_0(Band.getCPtr(targetBand), targetBand, Band.getCPtr(maskBand), maskBand, maxSearchDist, smoothingIterations, options, callback);
  }

  public static int FillNodata(Band targetBand, Band maskBand, double maxSearchDist, int smoothingIterations, java.util.Vector options) {
    return gdalJNI.FillNodata__SWIG_2(Band.getCPtr(targetBand), targetBand, Band.getCPtr(maskBand), maskBand, maxSearchDist, smoothingIterations, options);
  }

  public static int FillNodata(Band targetBand, Band maskBand, double maxSearchDist, int smoothingIterations) {
    return gdalJNI.FillNodata__SWIG_3(Band.getCPtr(targetBand), targetBand, Band.getCPtr(maskBand), maskBand, maxSearchDist, smoothingIterations);
  }

  public static int SieveFilter(Band srcBand, Band maskBand, Band dstBand, int threshold, int connectedness, java.util.Vector options, ProgressCallback callback) {
    return gdalJNI.SieveFilter__SWIG_0(Band.getCPtr(srcBand), srcBand, Band.getCPtr(maskBand), maskBand, Band.getCPtr(dstBand), dstBand, threshold, connectedness, options, callback);
  }

  public static int SieveFilter(Band srcBand, Band maskBand, Band dstBand, int threshold, int connectedness, java.util.Vector options) {
    return gdalJNI.SieveFilter__SWIG_2(Band.getCPtr(srcBand), srcBand, Band.getCPtr(maskBand), maskBand, Band.getCPtr(dstBand), dstBand, threshold, connectedness, options);
  }

  public static int SieveFilter(Band srcBand, Band maskBand, Band dstBand, int threshold, int connectedness) {
    return gdalJNI.SieveFilter__SWIG_3(Band.getCPtr(srcBand), srcBand, Band.getCPtr(maskBand), maskBand, Band.getCPtr(dstBand), dstBand, threshold, connectedness);
  }

  public static int SieveFilter(Band srcBand, Band maskBand, Band dstBand, int threshold) {
    return gdalJNI.SieveFilter__SWIG_4(Band.getCPtr(srcBand), srcBand, Band.getCPtr(maskBand), maskBand, Band.getCPtr(dstBand), dstBand, threshold);
  }

  public static int RegenerateOverviews(Band srcBand, Band[] overviewBandCount, String resampling, ProgressCallback callback) {
    return gdalJNI.RegenerateOverviews__SWIG_0(Band.getCPtr(srcBand), srcBand, overviewBandCount, resampling, callback);
  }

  public static int RegenerateOverviews(Band srcBand, Band[] overviewBandCount, String resampling) {
    return gdalJNI.RegenerateOverviews__SWIG_2(Band.getCPtr(srcBand), srcBand, overviewBandCount, resampling);
  }

  public static int RegenerateOverviews(Band srcBand, Band[] overviewBandCount) {
    return gdalJNI.RegenerateOverviews__SWIG_3(Band.getCPtr(srcBand), srcBand, overviewBandCount);
  }

  public static int RegenerateOverview(Band srcBand, Band overviewBand, String resampling, ProgressCallback callback) {
    return gdalJNI.RegenerateOverview__SWIG_0(Band.getCPtr(srcBand), srcBand, Band.getCPtr(overviewBand), overviewBand, resampling, callback);
  }

  public static int RegenerateOverview(Band srcBand, Band overviewBand, String resampling) {
    return gdalJNI.RegenerateOverview__SWIG_2(Band.getCPtr(srcBand), srcBand, Band.getCPtr(overviewBand), overviewBand, resampling);
  }

  public static int RegenerateOverview(Band srcBand, Band overviewBand) {
    return gdalJNI.RegenerateOverview__SWIG_3(Band.getCPtr(srcBand), srcBand, Band.getCPtr(overviewBand), overviewBand);
  }

  public static int GridCreate(String algorithmOptions, double[][] points, double xMin, double xMax, double yMin, double yMax, int xSize, int ySize, int dataType, java.nio.ByteBuffer nioBuffer, ProgressCallback callback) {
    return gdalJNI.GridCreate__SWIG_0(algorithmOptions, points, xMin, xMax, yMin, yMax, xSize, ySize, dataType, nioBuffer, callback);
  }

  public static int GridCreate(String algorithmOptions, double[][] points, double xMin, double xMax, double yMin, double yMax, int xSize, int ySize, int dataType, java.nio.ByteBuffer nioBuffer) {
    return gdalJNI.GridCreate__SWIG_2(algorithmOptions, points, xMin, xMax, yMin, yMax, xSize, ySize, dataType, nioBuffer);
  }

  public static int ContourGenerate(Band srcBand, double contourInterval, double contourBase, double[] fixedLevelCount, int useNoData, double noDataValue, Layer dstLayer, int idField, int elevField, ProgressCallback callback) {
    return gdalJNI.ContourGenerate__SWIG_0(Band.getCPtr(srcBand), srcBand, contourInterval, contourBase, fixedLevelCount, useNoData, noDataValue, Layer.getCPtr(dstLayer), dstLayer, idField, elevField, callback);
  }

  public static int ContourGenerate(Band srcBand, double contourInterval, double contourBase, double[] fixedLevelCount, int useNoData, double noDataValue, Layer dstLayer, int idField, int elevField) {
    return gdalJNI.ContourGenerate__SWIG_2(Band.getCPtr(srcBand), srcBand, contourInterval, contourBase, fixedLevelCount, useNoData, noDataValue, Layer.getCPtr(dstLayer), dstLayer, idField, elevField);
  }

  public static int ContourGenerateEx(Band srcBand, Layer dstLayer, java.util.Vector options, ProgressCallback callback) {
    return gdalJNI.ContourGenerateEx__SWIG_0(Band.getCPtr(srcBand), srcBand, Layer.getCPtr(dstLayer), dstLayer, options, callback);
  }

  public static int ContourGenerateEx(Band srcBand, Layer dstLayer, java.util.Vector options) {
    return gdalJNI.ContourGenerateEx__SWIG_2(Band.getCPtr(srcBand), srcBand, Layer.getCPtr(dstLayer), dstLayer, options);
  }

  public static int ContourGenerateEx(Band srcBand, Layer dstLayer) {
    return gdalJNI.ContourGenerateEx__SWIG_3(Band.getCPtr(srcBand), srcBand, Layer.getCPtr(dstLayer), dstLayer);
  }

  public static Dataset ViewshedGenerate(Band srcBand, String driverName, String targetRasterName, SWIGTYPE_p_p_char creationOptions, double observerX, double observerY, double observerHeight, double targetHeight, double visibleVal, double invisibleVal, double outOfRangeVal, double noDataVal, double dfCurvCoeff, ViewshedMode mode, double maxDistance, ProgressCallback callback, ViewshedOutputType heightMode, SWIGTYPE_p_p_char papszOptions) {
    long cPtr = gdalJNI.ViewshedGenerate__SWIG_0(Band.getCPtr(srcBand), srcBand, driverName, targetRasterName, SWIGTYPE_p_p_char.getCPtr(creationOptions), observerX, observerY, observerHeight, targetHeight, visibleVal, invisibleVal, outOfRangeVal, noDataVal, dfCurvCoeff, mode.swigValue(), maxDistance, callback, heightMode.swigValue(), SWIGTYPE_p_p_char.getCPtr(papszOptions));
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset ViewshedGenerate(Band srcBand, String driverName, String targetRasterName, SWIGTYPE_p_p_char creationOptions, double observerX, double observerY, double observerHeight, double targetHeight, double visibleVal, double invisibleVal, double outOfRangeVal, double noDataVal, double dfCurvCoeff, ViewshedMode mode, double maxDistance, ProgressCallback callback, ViewshedOutputType heightMode) {
    long cPtr = gdalJNI.ViewshedGenerate__SWIG_1(Band.getCPtr(srcBand), srcBand, driverName, targetRasterName, SWIGTYPE_p_p_char.getCPtr(creationOptions), observerX, observerY, observerHeight, targetHeight, visibleVal, invisibleVal, outOfRangeVal, noDataVal, dfCurvCoeff, mode.swigValue(), maxDistance, callback, heightMode.swigValue());
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset ViewshedGenerate(Band srcBand, String driverName, String targetRasterName, SWIGTYPE_p_p_char creationOptions, double observerX, double observerY, double observerHeight, double targetHeight, double visibleVal, double invisibleVal, double outOfRangeVal, double noDataVal, double dfCurvCoeff, ViewshedMode mode, double maxDistance, ProgressCallback callback) {
    long cPtr = gdalJNI.ViewshedGenerate__SWIG_2(Band.getCPtr(srcBand), srcBand, driverName, targetRasterName, SWIGTYPE_p_p_char.getCPtr(creationOptions), observerX, observerY, observerHeight, targetHeight, visibleVal, invisibleVal, outOfRangeVal, noDataVal, dfCurvCoeff, mode.swigValue(), maxDistance, callback);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset ViewshedGenerate(Band srcBand, String driverName, String targetRasterName, SWIGTYPE_p_p_char creationOptions, double observerX, double observerY, double observerHeight, double targetHeight, double visibleVal, double invisibleVal, double outOfRangeVal, double noDataVal, double dfCurvCoeff, ViewshedMode mode, double maxDistance) {
    long cPtr = gdalJNI.ViewshedGenerate__SWIG_4(Band.getCPtr(srcBand), srcBand, driverName, targetRasterName, SWIGTYPE_p_p_char.getCPtr(creationOptions), observerX, observerY, observerHeight, targetHeight, visibleVal, invisibleVal, outOfRangeVal, noDataVal, dfCurvCoeff, mode.swigValue(), maxDistance);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset AutoCreateWarpedVRT(Dataset src_ds, String src_wkt, String dst_wkt, int eResampleAlg, double maxerror) {
    long cPtr = gdalJNI.AutoCreateWarpedVRT__SWIG_0(Dataset.getCPtr(src_ds), src_ds, src_wkt, dst_wkt, eResampleAlg, maxerror);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset AutoCreateWarpedVRT(Dataset src_ds, String src_wkt, String dst_wkt, int eResampleAlg) {
    long cPtr = gdalJNI.AutoCreateWarpedVRT__SWIG_1(Dataset.getCPtr(src_ds), src_ds, src_wkt, dst_wkt, eResampleAlg);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset AutoCreateWarpedVRT(Dataset src_ds, String src_wkt, String dst_wkt) {
    long cPtr = gdalJNI.AutoCreateWarpedVRT__SWIG_2(Dataset.getCPtr(src_ds), src_ds, src_wkt, dst_wkt);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset AutoCreateWarpedVRT(Dataset src_ds, String src_wkt) {
    long cPtr = gdalJNI.AutoCreateWarpedVRT__SWIG_3(Dataset.getCPtr(src_ds), src_ds, src_wkt);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset AutoCreateWarpedVRT(Dataset src_ds) {
    long cPtr = gdalJNI.AutoCreateWarpedVRT__SWIG_4(Dataset.getCPtr(src_ds), src_ds);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset CreatePansharpenedVRT(String pszXML, Band panchroBand, Band[] nInputSpectralBands) {
    long cPtr = gdalJNI.CreatePansharpenedVRT(pszXML, Band.getCPtr(panchroBand), panchroBand, nInputSpectralBands);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset ApplyVerticalShiftGrid(Dataset src_ds, Dataset grid_ds, boolean inverse, double srcUnitToMeter, double dstUnitToMeter, java.util.Vector options) {
    long cPtr = gdalJNI.ApplyVerticalShiftGrid__SWIG_0(Dataset.getCPtr(src_ds), src_ds, Dataset.getCPtr(grid_ds), grid_ds, inverse, srcUnitToMeter, dstUnitToMeter, options);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset ApplyVerticalShiftGrid(Dataset src_ds, Dataset grid_ds, boolean inverse, double srcUnitToMeter, double dstUnitToMeter) {
    long cPtr = gdalJNI.ApplyVerticalShiftGrid__SWIG_1(Dataset.getCPtr(src_ds), src_ds, Dataset.getCPtr(grid_ds), grid_ds, inverse, srcUnitToMeter, dstUnitToMeter);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset ApplyVerticalShiftGrid(Dataset src_ds, Dataset grid_ds, boolean inverse, double srcUnitToMeter) {
    long cPtr = gdalJNI.ApplyVerticalShiftGrid__SWIG_2(Dataset.getCPtr(src_ds), src_ds, Dataset.getCPtr(grid_ds), grid_ds, inverse, srcUnitToMeter);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset ApplyVerticalShiftGrid(Dataset src_ds, Dataset grid_ds, boolean inverse) {
    long cPtr = gdalJNI.ApplyVerticalShiftGrid__SWIG_3(Dataset.getCPtr(src_ds), src_ds, Dataset.getCPtr(grid_ds), grid_ds, inverse);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset ApplyVerticalShiftGrid(Dataset src_ds, Dataset grid_ds) {
    long cPtr = gdalJNI.ApplyVerticalShiftGrid__SWIG_4(Dataset.getCPtr(src_ds), src_ds, Dataset.getCPtr(grid_ds), grid_ds);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static void ApplyGeoTransform(double[] padfGeoTransform, double dfPixel, double dfLine, double[] pdfGeoX, double[] pdfGeoY) {
    gdalJNI.ApplyGeoTransform(padfGeoTransform, dfPixel, dfLine, pdfGeoX, pdfGeoY);
  }

  public static int InvGeoTransform(double[] gt_in, double[] gt_out) {
    return gdalJNI.InvGeoTransform(gt_in, gt_out);
  }

  public static String VersionInfo(String request) {
    return gdalJNI.VersionInfo__SWIG_0(request);
  }

  public static String VersionInfo() {
    return gdalJNI.VersionInfo__SWIG_1();
  }

  public static void AllRegister() {
    gdalJNI.AllRegister();
  }

  public static void GDALDestroyDriverManager() {
    gdalJNI.GDALDestroyDriverManager();
  }

  public static int GetCacheMax() {
    return gdalJNI.GetCacheMax();
  }

  public static int GetCacheUsed() {
    return gdalJNI.GetCacheUsed();
  }

  public static void SetCacheMax(int nBytes) {
    gdalJNI.SetCacheMax(nBytes);
  }

  public static int GetDataTypeSize(int eDataType) {
    return gdalJNI.GetDataTypeSize(eDataType);
  }

  public static int DataTypeIsComplex(int eDataType) {
    return gdalJNI.DataTypeIsComplex(eDataType);
  }

  public static String GetDataTypeName(int eDataType) {
    return gdalJNI.GetDataTypeName(eDataType);
  }

  public static int GetDataTypeByName(String pszDataTypeName) {
    return gdalJNI.GetDataTypeByName(pszDataTypeName);
  }

  public static String GetColorInterpretationName(int eColorInterp) {
    return gdalJNI.GetColorInterpretationName(eColorInterp);
  }

  public static String GetPaletteInterpretationName(int ePaletteInterp) {
    return gdalJNI.GetPaletteInterpretationName(ePaletteInterp);
  }

  public static String DecToDMS(double dfAngle, String pszAxis, int nPrecision) {
    return gdalJNI.DecToDMS__SWIG_0(dfAngle, pszAxis, nPrecision);
  }

  public static String DecToDMS(double dfAngle, String pszAxis) {
    return gdalJNI.DecToDMS__SWIG_1(dfAngle, pszAxis);
  }

  public static double PackedDMSToDec(double dfPacked) {
    return gdalJNI.PackedDMSToDec(dfPacked);
  }

  public static double DecToPackedDMS(double dfDec) {
    return gdalJNI.DecToPackedDMS(dfDec);
  }

  public static XMLNode ParseXMLString(String pszXMLString) {
    long cPtr = gdalJNI.ParseXMLString(pszXMLString);
    return (cPtr == 0) ? null : new XMLNode(cPtr, true);
  }

  public static String SerializeXMLTree(XMLNode xmlnode) {
    return gdalJNI.SerializeXMLTree(XMLNode.getCPtr(xmlnode), xmlnode);
  }

  public static String GetJPEG2000StructureAsString(String pszFilename, java.util.Vector options) {
    return gdalJNI.GetJPEG2000StructureAsString__SWIG_0(pszFilename, options);
  }

  public static String GetJPEG2000StructureAsString(String pszFilename) {
    return gdalJNI.GetJPEG2000StructureAsString__SWIG_1(pszFilename);
  }

  public static int GetDriverCount() {
    return gdalJNI.GetDriverCount();
  }

  public static Driver GetDriverByName(String name) {
    long cPtr = gdalJNI.GetDriverByName(name);
    return (cPtr == 0) ? null : new Driver(cPtr, false);
  }

  public static Driver GetDriver(int i) {
    long cPtr = gdalJNI.GetDriver(i);
    return (cPtr == 0) ? null : new Driver(cPtr, false);
  }

  public static Dataset Open(String utf8_path, int eAccess) {
    long cPtr = gdalJNI.Open__SWIG_0(utf8_path, eAccess);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset Open(String name) {
    long cPtr = gdalJNI.Open__SWIG_1(name);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset OpenEx(String utf8_path, long nOpenFlags, java.util.Vector allowed_drivers, java.util.Vector open_options, java.util.Vector sibling_files) {
    long cPtr = gdalJNI.OpenEx__SWIG_0(utf8_path, nOpenFlags, allowed_drivers, open_options, sibling_files);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset OpenEx(String utf8_path, long nOpenFlags, java.util.Vector allowed_drivers, java.util.Vector open_options) {
    long cPtr = gdalJNI.OpenEx__SWIG_1(utf8_path, nOpenFlags, allowed_drivers, open_options);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset OpenEx(String utf8_path, long nOpenFlags, java.util.Vector allowed_drivers) {
    long cPtr = gdalJNI.OpenEx__SWIG_2(utf8_path, nOpenFlags, allowed_drivers);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset OpenEx(String utf8_path, long nOpenFlags) {
    long cPtr = gdalJNI.OpenEx__SWIG_3(utf8_path, nOpenFlags);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset OpenEx(String utf8_path) {
    long cPtr = gdalJNI.OpenEx__SWIG_4(utf8_path);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset OpenShared(String utf8_path, int eAccess) {
    long cPtr = gdalJNI.OpenShared__SWIG_0(utf8_path, eAccess);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset OpenShared(String utf8_path) {
    long cPtr = gdalJNI.OpenShared__SWIG_1(utf8_path);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Driver IdentifyDriver(String utf8_path, java.util.Vector papszSiblings) {
    long cPtr = gdalJNI.IdentifyDriver__SWIG_0(utf8_path, papszSiblings);
    return (cPtr == 0) ? null : new Driver(cPtr, false);
  }

  public static Driver IdentifyDriver(String utf8_path) {
    long cPtr = gdalJNI.IdentifyDriver__SWIG_1(utf8_path);
    return (cPtr == 0) ? null : new Driver(cPtr, false);
  }

  public static Driver IdentifyDriverEx(String utf8_path, long nIdentifyFlags, java.util.Vector allowed_drivers, java.util.Vector sibling_files) {
    long cPtr = gdalJNI.IdentifyDriverEx__SWIG_0(utf8_path, nIdentifyFlags, allowed_drivers, sibling_files);
    return (cPtr == 0) ? null : new Driver(cPtr, false);
  }

  public static Driver IdentifyDriverEx(String utf8_path, long nIdentifyFlags, java.util.Vector allowed_drivers) {
    long cPtr = gdalJNI.IdentifyDriverEx__SWIG_1(utf8_path, nIdentifyFlags, allowed_drivers);
    return (cPtr == 0) ? null : new Driver(cPtr, false);
  }

  public static Driver IdentifyDriverEx(String utf8_path, long nIdentifyFlags) {
    long cPtr = gdalJNI.IdentifyDriverEx__SWIG_2(utf8_path, nIdentifyFlags);
    return (cPtr == 0) ? null : new Driver(cPtr, false);
  }

  public static Driver IdentifyDriverEx(String utf8_path) {
    long cPtr = gdalJNI.IdentifyDriverEx__SWIG_3(utf8_path);
    return (cPtr == 0) ? null : new Driver(cPtr, false);
  }

  public static java.util.Vector GeneralCmdLineProcessor(java.util.Vector papszArgv, int nOptions) {
    return gdalJNI.GeneralCmdLineProcessor__SWIG_0(papszArgv, nOptions);
  }

  public static java.util.Vector GeneralCmdLineProcessor(java.util.Vector papszArgv) {
    return gdalJNI.GeneralCmdLineProcessor__SWIG_1(papszArgv);
  }

  public static String GDALInfo(Dataset hDataset, InfoOptions infoOptions) {
    return gdalJNI.GDALInfo(Dataset.getCPtr(hDataset), hDataset, InfoOptions.getCPtr(infoOptions), infoOptions);
  }

  public static String GDALMultiDimInfo(Dataset hDataset, MultiDimInfoOptions infoOptions) {
    return gdalJNI.GDALMultiDimInfo(Dataset.getCPtr(hDataset), hDataset, MultiDimInfoOptions.getCPtr(infoOptions), infoOptions);
  }

  public static Dataset Translate(String dest, Dataset dataset, TranslateOptions translateOptions, ProgressCallback callback) {
    long cPtr = gdalJNI.Translate__SWIG_0(dest, Dataset.getCPtr(dataset), dataset, TranslateOptions.getCPtr(translateOptions), translateOptions, callback);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset Translate(String dest, Dataset dataset, TranslateOptions translateOptions) {
    long cPtr = gdalJNI.Translate__SWIG_2(dest, Dataset.getCPtr(dataset), dataset, TranslateOptions.getCPtr(translateOptions), translateOptions);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static int Warp(Dataset dstDS, Dataset[] object_list_count, WarpOptions warpAppOptions, ProgressCallback callback) {
    return gdalJNI.Warp__SWIG_0(Dataset.getCPtr(dstDS), dstDS, object_list_count, WarpOptions.getCPtr(warpAppOptions), warpAppOptions, callback);
  }

  public static int Warp(Dataset dstDS, Dataset[] object_list_count, WarpOptions warpAppOptions) {
    return gdalJNI.Warp__SWIG_2(Dataset.getCPtr(dstDS), dstDS, object_list_count, WarpOptions.getCPtr(warpAppOptions), warpAppOptions);
  }

  public static Dataset Warp(String dest, Dataset[] object_list_count, WarpOptions warpAppOptions, ProgressCallback callback) {
    long cPtr = gdalJNI.Warp__SWIG_3(dest, object_list_count, WarpOptions.getCPtr(warpAppOptions), warpAppOptions, callback);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset Warp(String dest, Dataset[] object_list_count, WarpOptions warpAppOptions) {
    long cPtr = gdalJNI.Warp__SWIG_5(dest, object_list_count, WarpOptions.getCPtr(warpAppOptions), warpAppOptions);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static int VectorTranslate(Dataset dstDS, Dataset srcDS, VectorTranslateOptions options, ProgressCallback callback) {
    return gdalJNI.VectorTranslate__SWIG_0(Dataset.getCPtr(dstDS), dstDS, Dataset.getCPtr(srcDS), srcDS, VectorTranslateOptions.getCPtr(options), options, callback);
  }

  public static int VectorTranslate(Dataset dstDS, Dataset srcDS, VectorTranslateOptions options) {
    return gdalJNI.VectorTranslate__SWIG_2(Dataset.getCPtr(dstDS), dstDS, Dataset.getCPtr(srcDS), srcDS, VectorTranslateOptions.getCPtr(options), options);
  }

  public static Dataset VectorTranslate(String dest, Dataset srcDS, VectorTranslateOptions options, ProgressCallback callback) {
    long cPtr = gdalJNI.VectorTranslate__SWIG_3(dest, Dataset.getCPtr(srcDS), srcDS, VectorTranslateOptions.getCPtr(options), options, callback);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset VectorTranslate(String dest, Dataset srcDS, VectorTranslateOptions options) {
    long cPtr = gdalJNI.VectorTranslate__SWIG_5(dest, Dataset.getCPtr(srcDS), srcDS, VectorTranslateOptions.getCPtr(options), options);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset DEMProcessing(String dest, Dataset dataset, String pszProcessing, String pszColorFilename, DEMProcessingOptions options, ProgressCallback callback) {
    long cPtr = gdalJNI.DEMProcessing__SWIG_0(dest, Dataset.getCPtr(dataset), dataset, pszProcessing, pszColorFilename, DEMProcessingOptions.getCPtr(options), options, callback);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset DEMProcessing(String dest, Dataset dataset, String pszProcessing, String pszColorFilename, DEMProcessingOptions options) {
    long cPtr = gdalJNI.DEMProcessing__SWIG_2(dest, Dataset.getCPtr(dataset), dataset, pszProcessing, pszColorFilename, DEMProcessingOptions.getCPtr(options), options);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static int Nearblack(Dataset dstDS, Dataset srcDS, NearblackOptions options, ProgressCallback callback) {
    return gdalJNI.Nearblack__SWIG_0(Dataset.getCPtr(dstDS), dstDS, Dataset.getCPtr(srcDS), srcDS, NearblackOptions.getCPtr(options), options, callback);
  }

  public static int Nearblack(Dataset dstDS, Dataset srcDS, NearblackOptions options) {
    return gdalJNI.Nearblack__SWIG_2(Dataset.getCPtr(dstDS), dstDS, Dataset.getCPtr(srcDS), srcDS, NearblackOptions.getCPtr(options), options);
  }

  public static Dataset Nearblack(String dest, Dataset srcDS, NearblackOptions options, ProgressCallback callback) {
    long cPtr = gdalJNI.Nearblack__SWIG_3(dest, Dataset.getCPtr(srcDS), srcDS, NearblackOptions.getCPtr(options), options, callback);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset Nearblack(String dest, Dataset srcDS, NearblackOptions options) {
    long cPtr = gdalJNI.Nearblack__SWIG_5(dest, Dataset.getCPtr(srcDS), srcDS, NearblackOptions.getCPtr(options), options);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset Grid(String dest, Dataset dataset, GridOptions options, ProgressCallback callback) {
    long cPtr = gdalJNI.Grid__SWIG_0(dest, Dataset.getCPtr(dataset), dataset, GridOptions.getCPtr(options), options, callback);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset Grid(String dest, Dataset dataset, GridOptions options) {
    long cPtr = gdalJNI.Grid__SWIG_2(dest, Dataset.getCPtr(dataset), dataset, GridOptions.getCPtr(options), options);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static int Rasterize(Dataset dstDS, Dataset srcDS, RasterizeOptions options, ProgressCallback callback) {
    return gdalJNI.Rasterize__SWIG_0(Dataset.getCPtr(dstDS), dstDS, Dataset.getCPtr(srcDS), srcDS, RasterizeOptions.getCPtr(options), options, callback);
  }

  public static int Rasterize(Dataset dstDS, Dataset srcDS, RasterizeOptions options) {
    return gdalJNI.Rasterize__SWIG_2(Dataset.getCPtr(dstDS), dstDS, Dataset.getCPtr(srcDS), srcDS, RasterizeOptions.getCPtr(options), options);
  }

  public static Dataset Rasterize(String dest, Dataset srcDS, RasterizeOptions options, ProgressCallback callback) {
    long cPtr = gdalJNI.Rasterize__SWIG_3(dest, Dataset.getCPtr(srcDS), srcDS, RasterizeOptions.getCPtr(options), options, callback);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset Rasterize(String dest, Dataset srcDS, RasterizeOptions options) {
    long cPtr = gdalJNI.Rasterize__SWIG_5(dest, Dataset.getCPtr(srcDS), srcDS, RasterizeOptions.getCPtr(options), options);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset BuildVRT(String dest, Dataset[] object_list_count, BuildVRTOptions options, ProgressCallback callback) {
    long cPtr = gdalJNI.BuildVRT__SWIG_0(dest, object_list_count, BuildVRTOptions.getCPtr(options), options, callback);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset BuildVRT(String dest, Dataset[] object_list_count, BuildVRTOptions options) {
    long cPtr = gdalJNI.BuildVRT__SWIG_2(dest, object_list_count, BuildVRTOptions.getCPtr(options), options);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset BuildVRT(String dest, java.util.Vector source_filenames, BuildVRTOptions options, ProgressCallback callback) {
    long cPtr = gdalJNI.BuildVRT__SWIG_3(dest, source_filenames, BuildVRTOptions.getCPtr(options), options, callback);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset BuildVRT(String dest, java.util.Vector source_filenames, BuildVRTOptions options) {
    long cPtr = gdalJNI.BuildVRT__SWIG_5(dest, source_filenames, BuildVRTOptions.getCPtr(options), options);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset MultiDimTranslate(String dest, Dataset[] object_list_count, MultiDimTranslateOptions multiDimTranslateOptions, ProgressCallback callback) {
    long cPtr = gdalJNI.MultiDimTranslate__SWIG_0(dest, object_list_count, MultiDimTranslateOptions.getCPtr(multiDimTranslateOptions), multiDimTranslateOptions, callback);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

  public static Dataset MultiDimTranslate(String dest, Dataset[] object_list_count, MultiDimTranslateOptions multiDimTranslateOptions) {
    long cPtr = gdalJNI.MultiDimTranslate__SWIG_2(dest, object_list_count, MultiDimTranslateOptions.getCPtr(multiDimTranslateOptions), multiDimTranslateOptions);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

}
