package com.whizdm.document;
import java.util.HashMap;
import java.util.Map;

/**
 * Created By: Aditya Misra on 2020-02-29
 */

public class DocumentUploadRemark {

    public static final int name = 1;
    public static final int dob = 2;
    public static final int docId = 4;
    public static final int address = 8;
    public static final int selfieVideo = 16;
    public static final int dobMissing = 32;
    public static final int bothDocNotuploaded = 64;

    public static final String aadhaar = "Aadhaar";
    public static final String pan = "Pan";
    public static final String passport = "Passport";
    public static final String selfie = "Selfie";
    public static final String video = "Video";


    public static final Map<Integer, String> docUploadRemarkMap = new HashMap<>();

    static {
        docUploadRemarkMap.put(0, "Auto approved using Hyperverge data.");

        docUploadRemarkMap.put(name, "We are not able to verify name on your #documentName document. Please re-upload #documentName.");
        docUploadRemarkMap.put(docId, "We are not able to verify #documentName No. on your #documentName document. Please re-upload #documentName.");
        docUploadRemarkMap.put(dob, "We are not able to verify DOB on your #documentName document. Please re-upload #documentName");
        docUploadRemarkMap.put(address, "We are not able to verify address on your #documentName document. Please re-upload #documentName");
        docUploadRemarkMap.put(dobMissing, "The complete date of birth seems to be missing in your aadhaar. Please upload your PAN having complete DOB in (dd/mm/yyyy) format");

        docUploadRemarkMap.put(bothDocNotuploaded, "You have uploaded only one side(front/back) of your #documentName. Please upload both( front and back side) of #documentName to proceed ahead.");

        docUploadRemarkMap.put(selfieVideo, "Your #documentName which has been uploaded is not clearly visible. Please re-upload your clear #documentName.");

        docUploadRemarkMap.put((name + dob), "We are not able to verify DOB and name on your #documentName document. Please re-upload #documentName.");
        docUploadRemarkMap.put((name + docId), "We are not able to verify name and #documentName No. on your #documentName document. Please re-upload #documentName.");
        docUploadRemarkMap.put((dob + docId), "We are not able to verify DOB and #documentName No. on your #documentName document. Please re-upload #documentName.");

        docUploadRemarkMap.put((address + name), "We are not able to verify name and address on your #documentName document. Please re-upload #documentName.");
        docUploadRemarkMap.put((address + docId), "We are not able to verify address and #documentName No. on your #documentName document. Please re-upload #documentName.");

        docUploadRemarkMap.put((name + docId + dob), "We are not able to verify your #documentName document. Please re-upload #documentName.");
        docUploadRemarkMap.put((name + docId + address), "We are not able to verify your #documentName. Please re-upload your #documentName");
    }
}
