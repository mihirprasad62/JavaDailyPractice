package com.kodewala.stringoperation.usecasetwo;

public class FileUploadProcessing {
	//variable 
	private String filePath="user-profile_photo2025.JPG";
	String[] allowedFormat={".jpg",".png",".jpeg"};
	boolean isMatchedFiletype;
	
	//method to process file info
	
	public void processFileInfo(String _input) {
		//method to extract file extention
		int startIndex=filePath.lastIndexOf(".");
		String fileExtension=filePath.substring(startIndex);
		System.out.println(fileExtension);
		
		//check allowed format 
		int startIdx=_input.lastIndexOf(".");
		String fileTypeExtension=_input.substring(startIdx).toLowerCase();
		System.out.println(fileTypeExtension);
		
		for(String s:allowedFormat) {
			if(fileTypeExtension.equals(s)) {
				isMatchedFiletype=true;
			}	
		}
		if(isMatchedFiletype) {
			System.out.println("valid file format");
		}else {
			System.out.println("invalid file format");
		}
		
		//rename file with time stamp
		String baseString=_input.substring(0,_input.lastIndexOf(".")).trim();
		long timeStamp=System.currentTimeMillis();
		System.out.println(baseString+"_"+timeStamp+fileTypeExtension);
		
		//check if the uploaded file is already exists
		
		if(_input.equalsIgnoreCase(filePath)) {
			System.out.println("The file is already present");
		}else {
			System.out.println("The input file is not saved before.");
		}
		
		//remove special characters from file name
		String formattedString=_input.replaceAll("[^a-zA-Z0-9_-]", "");
		System.out.println(formattedString);
		
	}

}
