package net.ebt.imagelibrary.exif

object Directories {
    object ExifIFD0 {

        val name = "Exif IFD0"

        // Reduced-resolution image / 254
        val NEW_SUBFILE_TYPE = "New Subfile Type"

        // 160 pixels / 256
        val IMAGE_WIDTH = "Image Width"

        // 120 pixels / 257
        val IMAGE_HEIGHT = "Image Height"

        // 8 8 8 bits/component/pixel / 258
        val BITS_PER_SAMPLE = "Bits Per Sample"

        // JPEG / 259
        val COMPRESSION = "Compression"

        // YCbCr / 262
        val PHOTOMETRIC_INTERPRETATION = "Photometric Interpretation"

        // FUJIFILM / 271
        val MAKE = "Make"

        // FinePix F30     / 272
        val MODEL = "Model"

        // 4096 / 273
        val STRIP_OFFSETS = "Strip Offsets"

        // Top, left side (Horizontal / normal) / 274
        val ORIENTATION = "Orientation"

        // 3 samples/pixel / 277
        val SAMPLES_PER_PIXEL = "Samples Per Pixel"

        // 120 rows/strip / 278
        val ROWS_PER_STRIP = "Rows Per Strip"

        // 17031 bytes / 279
        val STRIP_BYTE_COUNTS = "Strip Byte Counts"

        // 72 dots per inch / 282
        val X_RESOLUTION = "X Resolution"

        // 72 dots per inch / 283
        val Y_RESOLUTION = "Y Resolution"

        // Chunky (contiguous for each subsampling pixel) / 284
        val PLANAR_CONFIGURATION = "Planar Configuration"

        // Inch / 296
        val RESOLUTION_UNIT = "Resolution Unit"

        // Digital Camera FinePix F30     Ver1.01 / 305
        val SOFTWARE = "Software"

        //  / 315
        val ARTIST = "Artist"

        // 299/1000 587/1000 114/1000 / 529
        val YCBCR_COEFFICIENTS = "YCbCr Coefficients"

        // [0,128,128] [255,255,255] / 532
        val REFERENCE_BLACK_WHITE = "Reference Black/White"

        //      / 33432
        val COPYRIGHT = "Copyright"

        // 0 / 34859
        val SELF_TIMER_MODE = "Self Timer Mode"

        // 2018:08:11 12:56:14 / 36867
        val DATE_TIME_ORIGINAL = "Date/Time Original"

        // 0 0 0 1 / 37398
        val TIFF_EP_STANDARD_ID = "TIFF/EP Standard ID"

        // 1 3 0 0 / 50706
        val UNKNOWN_TAG__0XC612_ = "Unknown tag (0xc612)"

        // 1 1 0 0 / 50707
        val UNKNOWN_TAG__0XC613_ = "Unknown tag (0xc613)"

        // LEICA M (Typ 240) / 50708
        val UNKNOWN_TAG__0XC614_ = "Unknown tag (0xc614)"

        // 7571/10000 -2249/10000 -223/10000 -4171/10000 13145/10000 1062/10000 -357/10000 1601/10000 7591/10000 / 50721
        val UNKNOWN_TAG__0XC621_ = "Unknown tag (0xc621)"

        // 6653/10000 -1486/10000 -611/10000 -4221/10000 13303/10000 929/10000 -881/10000 2416/10000 7226/10000 / 50722
        val UNKNOWN_TAG__0XC622_ = "Unknown tag (0xc622)"

        // 1/1 0/1 0/1 0/1 1/1 0/1 0/1 0/1 1/1 / 50723
        val UNKNOWN_TAG__0XC623_ = "Unknown tag (0xc623)"

        // 1/1 0/1 0/1 0/1 1/1 0/1 0/1 0/1 1/1 / 50724
        val UNKNOWN_TAG__0XC624_ = "Unknown tag (0xc624)"

        // 10240/22400 10240/10240 10240/13720 / 50728
        val UNKNOWN_TAG__0XC628_ = "Unknown tag (0xc628)"

        // -1 / 50730
        val UNKNOWN_TAG__0XC62A_ = "Unknown tag (0xc62a)"

        // 1 / 50731
        val UNKNOWN_TAG__0XC62B_ = "Unknown tag (0xc62b)"

        // 1 / 50732
        val UNKNOWN_TAG__0XC62C_ = "Unknown tag (0xc62c)"

        // 1 / 50734
        val UNKNOWN_TAG__0XC62E_ = "Unknown tag (0xc62e)"

        // 4823799 / 50735
        val UNKNOWN_TAG__0XC62F_ = "Unknown tag (0xc62f)"

        // 1 / 50739
        val UNKNOWN_TAG__0XC633_ = "Unknown tag (0xc633)"

        // 17 / 50778
        val UNKNOWN_TAG__0XC65A_ = "Unknown tag (0xc65a)"

        // 21 / 50779
        val UNKNOWN_TAG__0XC65B_ = "Unknown tag (0xc65b)"

        // 48 48 48 48 48 48 48 48 48 48 55 52 51 48 52 50 / 50781
        val UNKNOWN_TAG__0XC65D_ = "Unknown tag (0xc65d)"

        //                                 / 270
        val IMAGE_DESCRIPTION = "Image Description"

        // 2007:04:19 16:54:51 / 306
        val DATE_TIME = "Date/Time"

        // Datum point / 531
        val YCBCR_POSITIONING = "YCbCr Positioning"

        // Normal process / 41985
        val CUSTOM_RENDERED = "Custom Rendered"

        // Auto exposure / 41986
        val EXPOSURE_MODE = "Exposure Mode"

        // Manual white balance / 41987
        val WHITE_BALANCE_MODE = "White Balance Mode"

        // Digital zoom not used / 41988
        val DIGITAL_ZOOM_RATIO = "Digital Zoom Ratio"

        // 35 mm / 41989
        val FOCAL_LENGTH_35 = "Focal Length 35"

        // Standard / 41990
        val SCENE_CAPTURE_TYPE = "Scene Capture Type"

        // None / 41991
        val GAIN_CONTROL = "Gain Control"

        // None / 41992
        val CONTRAST = "Contrast"

        // None / 41993
        val SATURATION = "Saturation"

        // None / 41994
        val SHARPNESS = "Sharpness"

        // Distant view / 41996
        val SUBJECT_DISTANCE_RANGE = "Subject Distance Range"

        // Mac OS X 10.4.9 / 316
        val HOST_COMPUTER = "Host Computer"

    }

    object ExifSubIFD {

        val name = "Exif SubIFD"

        // Full-resolution image / 254
        val NEW_SUBFILE_TYPE = "New Subfile Type"

        // 5984 pixels / 256
        val IMAGE_WIDTH = "Image Width"

        // 4000 pixels / 257
        val IMAGE_HEIGHT = "Image Height"

        // 16 bits/component/pixel / 258
        val BITS_PER_SAMPLE = "Bits Per Sample"

        // JPEG / 259
        val COMPRESSION = "Compression"

        // Color Filter Array / 262
        val PHOTOMETRIC_INTERPRETATION = "Photometric Interpretation"

        // 21950 / 273
        val STRIP_OFFSETS = "Strip Offsets"

        // 1 samples/pixel / 277
        val SAMPLES_PER_PIXEL = "Samples Per Pixel"

        // 4000 rows/strip / 278
        val ROWS_PER_STRIP = "Rows Per Strip"

        // 31224522 bytes / 279
        val STRIP_BYTE_COUNTS = "Strip Byte Counts"

        // 300 dots per inch / 282
        val X_RESOLUTION = "X Resolution"

        // 300 dots per inch / 283
        val Y_RESOLUTION = "Y Resolution"

        // Chunky (contiguous for each subsampling pixel) / 284
        val PLANAR_CONFIGURATION = "Planar Configuration"

        // Inch / 296
        val RESOLUTION_UNIT = "Resolution Unit"

        // 2 2 / 33421
        val CFA_REPEAT_PATTERN_DIM = "CFA Repeat Pattern Dim"

        // [Red,Green][Green,Blue] / 41730
        val CFA_PATTERN = "CFA Pattern"

        // 1 1 / 50713
        val UNKNOWN_TAG__0XC619_ = "Unknown tag (0xc619)"

        // 0 / 50714
        val UNKNOWN_TAG__0XC61A_ = "Unknown tag (0xc61a)"

        // 15000 / 50717
        val UNKNOWN_TAG__0XC61D_ = "Unknown tag (0xc61d)"

        // 4 4 / 50719
        val UNKNOWN_TAG__0XC61F_ = "Unknown tag (0xc61f)"

        // 5976 3992 / 50720
        val UNKNOWN_TAG__0XC620_ = "Unknown tag (0xc620)"

        // 50 / 50733
        val UNKNOWN_TAG__0XC62D_ = "Unknown tag (0xc62d)"

        // 0 / 50738
        val UNKNOWN_TAG__0XC632_ = "Unknown tag (0xc632)"

        // 1/85 sec / 33434
        val EXPOSURE_TIME = "Exposure Time"

        // Program normal / 34850
        val EXPOSURE_PROGRAM = "Exposure Program"

        // 200 / 34855
        val ISO_SPEED_RATINGS = "ISO Speed Ratings"

        // 2.20 / 36864
        val EXIF_VERSION = "Exif Version"

        // 2007:04:19 16:54:51 / 36867
        val DATE_TIME_ORIGINAL = "Date/Time Original"

        // 2007:04:19 16:54:51 / 36868
        val DATE_TIME_DIGITIZED = "Date/Time Digitized"

        // YCbCr / 37121
        val COMPONENTS_CONFIGURATION = "Components Configuration"

        // 1/84 sec / 37377
        val SHUTTER_SPEED_VALUE = "Shutter Speed Value"

        // f/2.8 / 37378
        val APERTURE_VALUE = "Aperture Value"

        // 0 EV / 37380
        val EXPOSURE_BIAS_VALUE = "Exposure Bias Value"

        // f/2.8 / 37381
        val MAX_APERTURE_VALUE = "Max Aperture Value"

        // Multi-segment / 37383
        val METERING_MODE = "Metering Mode"

        // Unknown / 37384
        val WHITE_BALANCE = "White Balance"

        // Flash did not fire, auto / 37385
        val FLASH = "Flash"

        // 8 mm / 37386
        val FOCAL_LENGTH = "Focal Length"

        // sRGB / 40961
        val COLOR_SPACE = "Color Space"

        // 2848 pixels / 40962
        val EXIF_IMAGE_WIDTH = "Exif Image Width"

        // 2136 pixels / 40963
        val EXIF_IMAGE_HEIGHT = "Exif Image Height"

        // Digital Still Camera (DSC) / 41728
        val FILE_SOURCE = "File Source"

        // Directly photographed image / 41729
        val SCENE_TYPE = "Scene Type"

        // Normal process / 41985
        val CUSTOM_RENDERED = "Custom Rendered"

        // Auto exposure / 41986
        val EXPOSURE_MODE = "Exposure Mode"

        // Auto white balance / 41987
        val WHITE_BALANCE_MODE = "White Balance Mode"

        // Digital zoom not used / 41988
        val DIGITAL_ZOOM_RATIO = "Digital Zoom Ratio"

        // Standard / 41990
        val SCENE_CAPTURE_TYPE = "Scene Capture Type"

        // None / 41992
        val CONTRAST = "Contrast"

        // None / 41993
        val SATURATION = "Saturation"

        // None / 41994
        val SHARPNESS = "Sharpness"

        // 00000000000000000000000000743042 / 42016
        val UNIQUE_IMAGE_ID = "Unique Image ID"

        // f/2.8 / 33437
        val F_NUMBER = "F-Number"

        // 2 bits/pixel / 37122
        val COMPRESSED_BITS_PER_PIXEL = "Compressed Bits Per Pixel"

        //  / 37510
        val USER_COMMENT = "User Comment"

        // 1.00 / 40960
        val FLASHPIX_VERSION = "FlashPix Version"

        // 1/3703 cm / 41486
        val FOCAL_PLANE_X_RESOLUTION = "Focal Plane X Resolution"

        // 1/3703 cm / 41487
        val FOCAL_PLANE_Y_RESOLUTION = "Focal Plane Y Resolution"

        // cm / 41488
        val FOCAL_PLANE_RESOLUTION_UNIT = "Focal Plane Resolution Unit"

        // One-chip color area sensor / 41495
        val SENSING_METHOD = "Sensing Method"

        // Unknown / 41996
        val SUBJECT_DISTANCE_RANGE = "Subject Distance Range"

        // 3.3 / 37379
        val BRIGHTNESS_VALUE = "Brightness Value"

        // 35 mm / 41989
        val FOCAL_LENGTH_35 = "Focal Length 35"

        // Low gain down / 41991
        val GAIN_CONTROL = "Gain Control"

    }

    object XMP {

        val name = "XMP"

    }

    object LeicaMakernote {

        val name = "Leica Makernote"

        // null / 768
        val QUALITY = "Quality"

        // [81920 values] / 769
        val UNKNOWN_TAG__0X0301_ = "Unknown tag (0x0301)"

        // Elmarit-M 1:2.8/28 ASPH. / 771
        val SERIAL_NUMBER = "Serial Number"

        // Auto or Manual / 772
        val WHITE_BALANCE = "White Balance"

        // 0 0 0 2 / 784
        val LENS_TYPE = "Lens Type"

        // 0 / 785
        val EXTERNAL_SENSOR_BRIGHTNESS_VALUE = "External Sensor Brightness Value"

        // 0 / 786
        val MEASURED_LV = "Measured LV"

        // null / 800
        val CAMERA_TEMPERATURE = "Camera Temperature"

        // 0 / 801
        val COLOR_TEMPERATURE = "Color Temperature"

        // 0 / 816
        val CCD_VERSION = "CCD Version"

        // 0 / 817
        val CCD_BOARD_VERSION = "CCD Board Version"

        // 0 / 818
        val CONTROLLER_BOARD_VERSION = "Controller Board Version"

        // 0 / 819
        val M16_C_VERSION = "M16 C Version"

        // 743042 / 832
        val IMAGE_ID_NUMBER = "Image ID Number"

        // [1224 values] / 833
        val UNKNOWN_TAG__0X0341_ = "Unknown tag (0x0341)"

        // 0 / 834
        val UNKNOWN_TAG__0X0342_ = "Unknown tag (0x0342)"

        // 0 / 835
        val UNKNOWN_TAG__0X0343_ = "Unknown tag (0x0343)"

        // 0 / 836
        val UNKNOWN_TAG__0X0344_ = "Unknown tag (0x0344)"

        // 6 / 837
        val UNKNOWN_TAG__0X0345_ = "Unknown tag (0x0345)"

        // 9 / 838
        val UNKNOWN_TAG__0X0346_ = "Unknown tag (0x0346)"

        // 492498 / 839
        val UNKNOWN_TAG__0X0347_ = "Unknown tag (0x0347)"

        // 0 / 840
        val UNKNOWN_TAG__0X0348_ = "Unknown tag (0x0348)"

        // 61440 65024 62464 57344 59392 16384 24576 0 32768 40960 49152 53248 63488 64512 65280 0 / 841
        val UNKNOWN_TAG__0X0349_ = "Unknown tag (0x0349)"

        // 6 8 6 5 5 3 3 2 3 3 4 4 6 7 9 0 / 842
        val UNKNOWN_TAG__0X034A_ = "Unknown tag (0x034a)"

        // 8192 / 843
        val UNKNOWN_TAG__0X034B_ = "Unknown tag (0x034b)"

        // --- / 844
        val UNKNOWN_TAG__0X034C_ = "Unknown tag (0x034c)"

        // 1 / 845
        val UNKNOWN_TAG__0X034D_ = "Unknown tag (0x034d)"

        // 0 / 846
        val UNKNOWN_TAG__0X034E_ = "Unknown tag (0x034e)"

        // 0 / 847
        val UNKNOWN_TAG__0X034F_ = "Unknown tag (0x034f)"

        // 0 / 848
        val UNKNOWN_TAG__0X0350_ = "Unknown tag (0x0350)"

    }

    object GPS {

        val name = "GPS"

        // 2.200 / 0
        val GPS_VERSION_ID = "GPS Version ID"

        //  / 1
        val GPS_LATITUDE_REF = "GPS Latitude Ref"

        // 0° 0' 0" / 2
        val GPS_LATITUDE = "GPS Latitude"

        //  / 3
        val GPS_LONGITUDE_REF = "GPS Longitude Ref"

        // 0° 0' 0" / 4
        val GPS_LONGITUDE = "GPS Longitude"

        // Sea level / 5
        val GPS_ALTITUDE_REF = "GPS Altitude Ref"

        // 0 metres / 6
        val GPS_ALTITUDE = "GPS Altitude"

        // 00:00:00.000 UTC / 7
        val GPS_TIME_STAMP = "GPS Time-Stamp"

        // Void (Measurement Interoperability) / 9
        val GPS_STATUS = "GPS Status"

        // 0 / 11
        val GPS_DOP = "GPS DOP"

        // Unknown () / 12
        val GPS_SPEED_REF = "GPS Speed Ref"

        // 0 / 13
        val GPS_SPEED = "GPS Speed"

        // 0 degrees / 15
        val GPS_TRACK = "GPS Track"

        // 2000:00:00 / 29
        val GPS_DATE_STAMP = "GPS Date Stamp"

    }

    object FileType {

        val name = "File Type"

        // JPEG / 1
        val DETECTED_FILE_TYPE_NAME = "Detected File Type Name"

        // Joint Photographic Experts Group / 2
        val DETECTED_FILE_TYPE_LONG_NAME = "Detected File Type Long Name"

        // image/jpeg / 3
        val DETECTED_MIME_TYPE = "Detected MIME Type"

        // jpg / 4
        val EXPECTED_FILE_NAME_EXTENSION = "Expected File Name Extension"

    }

    object File {

        val name = "File"

        // 20070419-DSCF0757 5.JPG / 1
        val FILE_NAME = "File Name"

        // 1489226 bytes / 2
        val FILE_SIZE = "File Size"

        // Mon Aug 20 16:03:20 -07:00 2007 / 3
        val FILE_MODIFIED_DATE = "File Modified Date"

    }

    object JPEG {

        val name = "JPEG"

        // Baseline / -3
        val COMPRESSION_TYPE = "Compression Type"

        // 8 bits / 0
        val DATA_PRECISION = "Data Precision"

        // 2136 pixels / 1
        val IMAGE_HEIGHT = "Image Height"

        // 2848 pixels / 3
        val IMAGE_WIDTH = "Image Width"

        // 3 / 5
        val NUMBER_OF_COMPONENTS = "Number of Components"

        // Y component: Quantization table 0, Sampling factors 2 horiz/1 vert / 6
        val COMPONENT_1 = "Component 1"

        // Cb component: Quantization table 1, Sampling factors 1 horiz/1 vert / 7
        val COMPONENT_2 = "Component 2"

        // Cr component: Quantization table 2, Sampling factors 1 horiz/1 vert / 8
        val COMPONENT_3 = "Component 3"

    }

    object CanonMakernote {

        val name = "Canon Makernote"

        // 92 / 49408
        val UNKNOWN_TAG__0XC100_ = "Unknown tag (0xc100)"

        // Normal / 49409
        val MACRO_MODE = "Macro Mode"

        // Self timer not used / 49410
        val SELF_TIMER_DELAY = "Self Timer Delay"

        // Normal / 49411
        val QUALITY = "Quality"

        // No flash fired / 49412
        val FLASH_MODE = "Flash Mode"

        // Single shot / 49413
        val CONTINUOUS_DRIVE_MODE = "Continuous Drive Mode"

        // 0 / 49414
        val UNKNOWN_CAMERA_SETTING_2 = "Unknown Camera Setting 2"

        // Single / 49440
        val FOCUS_MODE = "Focus Mode"

        // 0 / 49416
        val UNKNOWN_CAMERA_SETTING_3 = "Unknown Camera Setting 3"

        // JPEG / 49417
        val RECORD_MODE = "Record Mode"

        // Large / 49418
        val IMAGE_SIZE = "Image Size"

        // Manual / 49419
        val EASY_SHOOTING_MODE = "Easy Shooting Mode"

        // No digital zoom / 49420
        val DIGITAL_ZOOM = "Digital Zoom"

        // High / 49421
        val CONTRAST = "Contrast"

        // High / 49422
        val SATURATION = "Saturation"

        // High / 49423
        val SHARPNESS = "Sharpness"

        // 16383 / 49424
        val ISO = "Iso"

        // Partial / 49425
        val METERING_MODE = "Metering Mode"

        // Unknown (2) / 49426
        val FOCUS_TYPE = "Focus Type"

        // Unknown (0) / 49427
        val AF_POINT_SELECTED = "AF Point Selected"

        // Program / 49428
        val EXPOSURE_MODE = "Exposure Mode"

        // 65535 / 49429
        val UNKNOWN_CAMERA_SETTING_7 = "Unknown Camera Setting 7"

        // N/A / 49430
        val LENS_TYPE = "Lens Type"

        // 55 1 / 49431
        val LONG_FOCAL_LENGTH = "Long Focal Length"

        // 18 1 / 49432
        val SHORT_FOCAL_LENGTH = "Short Focal Length"

        // 1 / 49433
        val FOCAL_UNITS_PER_MM = "Focal Units per mm"

        // f/5.6 / 49434
        val MAX_APERTURE = "Max Aperture"

        // f/32.0 / 49435
        val MIN_APERTURE = "Min Aperture"

        // Flash did not fire / 49436
        val FLASH_ACTIVITY = "Flash Activity"

        // Unknown (0) / 49437
        val FLASH_DETAILS = "Flash Details"

        // Single / 49438
        val FOCUS_CONTINUOUS = "Focus Continuous"

        // Normal AE / 49439
        val AE_SETTING = "AE Setting"

        // 65535 / 49441
        val DISPLAY_APERTURE = "Display Aperture"

        // 65535 / 49442
        val ZOOM_SOURCE_WIDTH = "Zoom Source Width"

        // 0 / 49443
        val ZOOM_TARGET_WIDTH = "Zoom Target Width"

        // 0 / 49444
        val UNKNOWN_TAG__0XC124_ = "Unknown tag (0xc124)"

        // Center / 49445
        val SPOT_METERING_MODE = "Spot Metering Mode"

        // Off / 49446
        val PHOTO_EFFECT = "Photo Effect"

        // Unknown (65535) / 49447
        val MANUAL_FLASH_OUTPUT = "Manual Flash Output"

        // 0 / 49448
        val UNKNOWN_TAG__0XC128_ = "Unknown tag (0xc128)"

        // n/a / 49449
        val COLOR_TONE = "Color Tone"

        // 1 / 49450
        val UNKNOWN_TAG__0XC12A_ = "Unknown tag (0xc12a)"

        // 32767 / 49451
        val UNKNOWN_TAG__0XC12B_ = "Unknown tag (0xc12b)"

        // 65535 / 49452
        val UNKNOWN_TAG__0XC12C_ = "Unknown tag (0xc12c)"

        // Unknown (65535) / 49453
        val SRAW_QUALITY = "SRAW Quality"

        // 65535 / 49454
        val UNKNOWN_TAG__0XC12E_ = "Unknown tag (0xc12e)"

        // 100 / 49455
        val UNKNOWN_TAG__0XC12F_ = "Unknown tag (0xc12f)"

        // 2 / 49664
        val UNKNOWN_TAG__0XC200_ = "Unknown tag (0xc200)"

        // 55 / 49665
        val UNKNOWN_TAG__0XC201_ = "Unknown tag (0xc201)"

        // 907 / 49666
        val UNKNOWN_TAG__0XC202_ = "Unknown tag (0xc202)"

        // 605 / 49667
        val UNKNOWN_TAG__0XC203_ = "Unknown tag (0xc203)"

        // 100 0 0 0 / 3
        val UNKNOWN_TAG__0X0003_ = "Unknown tag (0x0003)"

        // 68 / 50176
        val UNKNOWN_TAG__0XC400_ = "Unknown tag (0xc400)"

        // 0 / 50177
        val AUTO_ISO = "Auto ISO"

        // 288 / 50178
        val BASE_ISO = "Base ISO"

        // 212 / 50179
        val MEASURED_EV = "Measured EV"

        // 237 / 50180
        val TARGET_APERTURE = "Target Aperture"

        // 266 / 50181
        val TARGET_EXPOSURE_TIME = "Target Exposure Time"

        // 0 / 50182
        val EXPOSURE_COMPENSATION = "Exposure Compensation"

        // 0 / 50183
        val WHITE_BALANCE = "White Balance"

        // 3 / 50184
        val SLOW_SHUTTER = "Slow Shutter"

        // 0 / 50185
        val SEQUENCE_NUMBER = "Sequence Number"

        // 8 / 50186
        val OPTICAL_ZOOM_CODE = "Optical Zoom Code"

        // 8 / 50187
        val UNKNOWN_TAG__0XC40B_ = "Unknown tag (0xc40b)"

        // 0 / 50188
        val CAMERA_TEMPERATURE = "Camera Temperature"

        // 0 / 50189
        val FLASH_GUIDE_NUMBER = "Flash Guide Number"

        // 2 / 53770
        val AF_POINTS_IN_FOCUS = "AF Points in Focus"

        // 0 / 50191
        val FLASH_EXPOSURE_COMPENSATION = "Flash Exposure Compensation"

        // 0 / 50192
        val AUTO_EXPOSURE_BRACKETING = "Auto Exposure Bracketing"

        // 0 / 50193
        val AEB_BRACKET_VALUE = "AEB Bracket Value"

        // 1 / 50194
        val CONTROL_MODE = "Control Mode"

        // 0 / 50195
        val FOCUS_DISTANCE_UPPER = "Focus Distance Upper"

        // 0 / 50196
        val FOCUS_DISTANCE_LOWER = "Focus Distance Lower"

        // 232 / 50197
        val F_NUMBER = "F Number"

        // 428 / 50198
        val EXPOSURE_TIME = "Exposure Time"

        // 144 / 50199
        val MEASURED_EV_2 = "Measured EV 2"

        // 0 / 50200
        val BULB_DURATION = "Bulb Duration"

        // 0 / 50201
        val UNKNOWN_TAG__0XC419_ = "Unknown tag (0xc419)"

        // 252 / 50202
        val CAMERA_TYPE = "Camera Type"

        // 0 / 50203
        val AUTO_ROTATE = "Auto Rotate"

        // 65535 / 50204
        val ND_FILTER = "ND Filter"

        // 0 / 50205
        val SELF_TIMER_2 = "Self Timer 2"

        // 0 / 50206
        val UNKNOWN_TAG__0XC41E_ = "Unknown tag (0xc41e)"

        // 0 / 50207
        val UNKNOWN_TAG__0XC41F_ = "Unknown tag (0xc41f)"

        // 0 / 50208
        val UNKNOWN_TAG__0XC420_ = "Unknown tag (0xc420)"

        // 0 / 50209
        val FLASH_OUTPUT = "Flash Output"

        // 0 0 0 0 / 0
        val UNKNOWN_TAG__0X0000_ = "Unknown tag (0x0000)"

        // Canon EOS Kiss Digital N / 6
        val IMAGE_TYPE = "Image Type"

        // Firmware 1.0.1 / 7
        val FIRMWARE_VERSION = "Firmware Version"

        // 1000023 / 8
        val IMAGE_NUMBER = "Image Number"

        // unknown / 9
        val OWNER_NAME = "Owner Name"

        // [1024 values] / 13
        val CAMERA_INFO_ARRAY = "Camera Info Array"

        // 2147484041 / 16
        val CANON_MODEL_ID = "Canon Model ID"

        // [48 values] / 38
        val AF_INFO_ARRAY_2 = "AF Info Array 2"

        // 0 159 7 112 / 19
        val THUMBNAIL_IMAGE_VALID_AREA = "Thumbnail Image Valid Area"

        // [256 values] / 24
        val UNKNOWN_TAG__0X0018_ = "Unknown tag (0x0018)"

        // 1 / 25
        val UNKNOWN_TAG__0X0019_ = "Unknown tag (0x0019)"

        // 0 / 28
        val DATE_STAMP_MODE = "Date Stamp Mode"

        // 32 1 0 2 2 2 2 0 0 0 0 0 0 0 0 0 / 29
        val MY_COLORS = "My Colors"

        // 16777984 / 30
        val FIRMWARE_REVISION = "Firmware Revision"

        // [69 values] / 31
        val UNKNOWN_TAG__0X001F_ = "Unknown tag (0x001f)"

        // [208 values] / 34
        val UNKNOWN_TAG__0X0022_ = "Unknown tag (0x0022)"

        // 8 0 / 35
        val CATEGORIES = "Categories"

        // 10 0 65535 0 0 / 39
        val UNKNOWN_TAG__0X0027_ = "Unknown tag (0x0027)"

        // 58 175 55 79 44 99 52 91 235 90 141 138 124 225 126 199 / 40
        val IMAGE_UNIQUE_ID = "Image Unique ID"

        // 0 / 208
        val VRD_OFFSET = "VRD Offset"

        // 0 / 45
        val UNKNOWN_TAG__0X002D_ = "Unknown tag (0x002d)"

        // 8 0 0 1 / 46
        val UNKNOWN_TAG__0X002E_ = "Unknown tag (0x002e)"

        // 004000144 / 12
        val CAMERA_SERIAL_NUMBER = "Camera Serial Number"

        // 20 0 256 512 768 1024 1280 1536 1792 2048 / 15
        val CUSTOM_FUNCTIONS = "Custom Functions"

        // 7 / 53760
        val AF_POINT_COUNT = "AF Point Count"

        // 7 / 53761
        val VALID_AF_POINT_COUNT = "Valid AF Point Count"

        // 3456 / 53762
        val IMAGE_WIDTH = "Image Width"

        // 2304 / 53763
        val IMAGE_HEIGHT = "Image Height"

        // 3456 / 53764
        val AF_IMAGE_WIDTH = "AF Image Width"

        // 2304 / 53765
        val AF_IMAGE_HEIGHT = "AF Image Height"

        // 189 / 53766
        val AF_AREA_WIDTH = "AF Area Width"

        // 188 / 53767
        val AF_AREA_HEIGHT = "AF Area Height"

        // 0 -1237 -742 0 742 1237 0 / 53768
        val AF_AREA_X_POSITIONS = "AF Area X Positions"

        // -617 0 0 0 0 0 617 / 53769
        val AF_AREA_Y_POSITIONS = "AF Area Y Positions"

        // 65535 / 53771
        val PRIMARY_AF_POINT_1 = "Primary AF Point 1"

        // 2684354560 / 21
        val SERIAL_NUMBER_FORMAT = "Serial Number Format"

        // 0 / 131
        val ORIGINAL_DECISION_DATA_OFFSET = "Original Decision Data Offset"

        // 32 10714 143 0 0 0 65535 65535 0 0 0 0 0 0 0 0 / 147
        val FILE_INFO_ARRAY = "File Info Array"

        // 28 0 0 0 0 0 0 0 32768 5200 0 0 0 0 / 160
        val PROCESSING_INFORMATION_ARRAY = "Processing Information Array"

        // 10 393 1024 1024 773 / 170
        val MEASURED_COLOR_ARRAY = "Measured Color Array"

        // [17 values] / 224
        val SENSOR_INFORMATION_ARRAY = "Sensor Information Array"

        // [582 values] / 16385
        val COLOR_DATA_ARRAY_1 = "Color Data Array 1"

        // [2676 values] / 16386
        val CRW_PARAMETERS = "CRW Parameters"

        // [22 values] / 16387
        val COLOR_DATA_ARRAY_2 = "Color Data Array 2"

        // 0 / 53772
        val PRIMARY_AF_POINT_2 = "Primary AF Point 2"

        // 0 / 53773
        val UNKNOWN_TAG__0XD20D_ = "Unknown tag (0xd20d)"

        // 0 / 53774
        val UNKNOWN_TAG__0XD20E_ = "Unknown tag (0xd20e)"

        // 0 / 53775
        val UNKNOWN_TAG__0XD20F_ = "Unknown tag (0xd20f)"

        // 0 / 53776
        val UNKNOWN_TAG__0XD210_ = "Unknown tag (0xd210)"

        // 0 / 53777
        val UNKNOWN_TAG__0XD211_ = "Unknown tag (0xd211)"

        // 0 / 53778
        val UNKNOWN_TAG__0XD212_ = "Unknown tag (0xd212)"

        // 0 / 53779
        val UNKNOWN_TAG__0XD213_ = "Unknown tag (0xd213)"

        // 0 / 53780
        val UNKNOWN_TAG__0XD214_ = "Unknown tag (0xd214)"

        // 0 / 53781
        val UNKNOWN_TAG__0XD215_ = "Unknown tag (0xd215)"

        // 0 / 53782
        val UNKNOWN_TAG__0XD216_ = "Unknown tag (0xd216)"

        // 0 / 53783
        val UNKNOWN_TAG__0XD217_ = "Unknown tag (0xd217)"

        // 0 / 53784
        val UNKNOWN_TAG__0XD218_ = "Unknown tag (0xd218)"

        // 0 / 53785
        val UNKNOWN_TAG__0XD219_ = "Unknown tag (0xd219)"

        // 0 / 53786
        val UNKNOWN_TAG__0XD21A_ = "Unknown tag (0xd21a)"

    }

    object Interoperability {

        val name = "Interoperability"

        // Recommended Exif Interoperability Rules (ExifR98) / 1
        val INTEROPERABILITY_INDEX = "Interoperability Index"

        // 1.00 / 2
        val INTEROPERABILITY_VERSION = "Interoperability Version"

        // 1600 / 4097
        val RELATED_IMAGE_WIDTH = "Related Image Width"

        // 1200 / 4098
        val RELATED_IMAGE_HEIGHT = "Related Image Height"

    }

    object ExifThumbnail {

        val name = "Exif Thumbnail"

        // JPEG (old-style) / 259
        val COMPRESSION = "Compression"

        // 72 dots per inch / 282
        val X_RESOLUTION = "X Resolution"

        // 72 dots per inch / 283
        val Y_RESOLUTION = "Y Resolution"

        // Inch / 296
        val RESOLUTION_UNIT = "Resolution Unit"

        // 1362 bytes / 513
        val THUMBNAIL_OFFSET = "Thumbnail Offset"

        // 8660 bytes / 514
        val THUMBNAIL_LENGTH = "Thumbnail Length"

        // Top, left side (Horizontal / normal) / 274
        val ORIENTATION = "Orientation"

        // Datum point / 531
        val YCBCR_POSITIONING = "YCbCr Positioning"

        // SONY / 271
        val MAKE = "Make"

        // DSC-T7 / 272
        val MODEL = "Model"

        // 2005:12:17 05:52:27 / 306
        val DATE_TIME = "Date/Time"

    }

    object Huffman {

        val name = "Huffman"

        // 4 Huffman tables / 1
        val NUMBER_OF_TABLES = "Number of Tables"

    }

    object ICCProfile {

        val name = "ICC Profile"

        // 1304 / 0
        val PROFILE_SIZE = "Profile Size"

        // appl / 4
        val CMM_TYPE = "CMM Type"

        // 2.2.0 / 8
        val VERSION = "Version"

        // Input Device / 12
        val CLASS = "Class"

        // RGB  / 16
        val COLOR_SPACE = "Color space"

        // XYZ  / 20
        val PROFILE_CONNECTION_SPACE = "Profile Connection Space"

        // 2003:07:01 00:00:00 / 24
        val PROFILE_DATE_TIME = "Profile Date/Time"

        // acsp / 36
        val SIGNATURE = "Signature"

        // Apple Computer, Inc. / 40
        val PRIMARY_PLATFORM = "Primary Platform"

        // appl / 48
        val DEVICE_MANUFACTURER = "Device manufacturer"

        // 0.964 1 0.825 / 68
        val XYZ_VALUES = "XYZ values"

        // 11 / 128
        val TAG_COUNT = "Tag Count"

        // (0.4543, 0.2426, 0.0148) / 1918392666
        val RED_COLORANT = "Red Colorant"

        // (0.3533, 0.6744, 0.0904) / 1733843290
        val GREEN_COLORANT = "Green Colorant"

        // (0.1566, 0.0834, 0.7195) / 1649957210
        val BLUE_COLORANT = "Blue Colorant"

        // (0.9505, 1, 1.0891) / 2004119668
        val MEDIA_WHITE_POINT = "Media White Point"

        // sf32 (0x73663332): 44 bytes / 1667785060
        val CHROMATIC_ADAPTATION = "Chromatic Adaptation"

        // 0.0085908 / 1918128707
        val RED_TRC = "Red TRC"

        // 0.0085908 / 1733579331
        val GREEN_TRC = "Green TRC"

        // 0.0085908 / 1649693251
        val BLUE_TRC = "Blue TRC"

        // Camera RGB Profile / 1684370275
        val PROFILE_DESCRIPTION = "Profile Description"

        // Copyright 2003 Apple Computer Inc., all rights reserved. / 1668313716
        val COPYRIGHT = "Copyright"

        // 15 enUS(Camera RGB Profile) esES(Perfil RGB para Cámara) daDK(RGB-beskrivelse til Kamera) deDE(RGB-Profil für Kameras) fiFI(Kameran RGB-profiili) frFU(Profil RVB de l’appareil-photo) itIT(Profilo RGB Fotocamera) nlNL(RGB-profiel Camera) noNO(RGB-kameraprofil) ptBR(Perfil RGB de Câmera) svSE(RGB-profil för Kamera) jaJP(カメラ RGB プロファイル) koKR(카메라 RGB 프로파일) zhTW(數位相機 RGB 色彩描述) zhCN(相机 RGB 描述文件) / 1685283693
        val APPLE_MULTI_LANGUAGE_PROFILE_NAME = "Apple Multi-language Profile Name"

    }

    object FujifilmMakernote {

        val name = "Fujifilm Makernote"

        // 1.30 / 0
        val MAKERNOTE_VERSION = "Makernote Version"

        // NORMAL  / 4096
        val QUALITY = "Quality"

        // Normal / 4097
        val SHARPNESS = "Sharpness"

        // Auto / 4098
        val WHITE_BALANCE = "White Balance"

        // Off / 4112
        val FLASH_MODE = "Flash Mode"

        // 0 EV (Apex) / 4113
        val FLASH_STRENGTH = "Flash Strength"

        // Off / 4128
        val MACRO = "Macro"

        // Auto Focus / 4129
        val FOCUS_MODE = "Focus Mode"

        // Off / 4144
        val SLOW_SYNC = "Slow Sync"

        // Auto / 4145
        val PICTURE_MODE = "Picture Mode"

        // Off / 4352
        val AUTO_BRACKETING = "Auto Bracketing"

        // 0 / 4608
        val UNKNOWN_TAG__0X1200_ = "Unknown tag (0x1200)"

        // No Blur Warning / 4864
        val BLUR_WARNING = "Blur Warning"

        // Good Focus / 4865
        val FOCUS_WARNING = "Focus Warning"

        // AE Good / 4866
        val AE_WARNING = "AE Warning"

        // FC D7F03360 592D31303937060816805310216B57 / 16
        val SERIAL_NUMBER = "Serial Number"

        // Normal / 4099
        val COLOR_SATURATION = "Color Saturation"

        // 1 / 4130
        val UNKNOWN_TAG__0X1022_ = "Unknown tag (0x1022)"

        // 1424 1068 / 4131
        val FOCUS_PIXEL = "Focus Pixel"

        // 1 / 4146
        val UNKNOWN_TAG__0X1032_ = "Unknown tag (0x1032)"

        // 0 / 4353
        val SEQUENCE_NUMBER = "Sequence Number"

        // Standard / 4624
        val FINEPIX_COLOR_SETTING = "FinePix Color Setting"

        // Standard / 5120
        val DYNAMIC_RANGE = "Dynamic Range"

    }

    object PanasonicMakernote {

        val name = "Panasonic Makernote"

        // High / 1
        val QUALITY_MODE = "Quality Mode"

        // 1.03 / 2
        val VERSION = "Version"

        // Auto / 3
        val WHITE_BALANCE = "White Balance"

        // Auto / 7
        val FOCUS_MODE = "Focus Mode"

        // 1-area / 15
        val AF_AREA_MODE = "AF Area Mode"

        // On, Mode 2 / 26
        val IMAGE_STABILIZATION = "Image Stabilization"

        // On / 28
        val MACRO_MODE = "Macro Mode"

        // Normal / 31
        val RECORD_MODE = "Record Mode"

        // On / 32
        val AUDIO = "Audio"

        // (5314 bytes) / 33
        val UNKNOWN_DATA_DUMP = "Unknown Data Dump"

        // 0 / 34
        val EASY_MODE = "Easy Mode"

        // 0 / 35
        val WHITE_BALANCE_BIAS = "White Balance Bias"

        // 0 / 36
        val FLASH_BIAS = "Flash Bias"

        // F010509220083 / 37
        val INTERNAL_SERIAL_NUMBER = "Internal Serial Number"

        // 1.04 / 38
        val EXIF_VERSION = "Exif Version"

        // 0 / 39
        val UNKNOWN_TAG__0X0027_ = "Unknown tag (0x0027)"

        // Off / 40
        val COLOR_EFFECT = "Color Effect"

        // 48.85 s / 41
        val CAMERA_UPTIME = "Camera Uptime"

        // [512 values] / 17481
        val UNKNOWN_TAG__0X4449_ = "Unknown tag (0x4449)"

        //  / 18768
        val UNKNOWN_TAG__0X4950_ = "Unknown tag (0x4950)"

        // Off / 42
        val BURST_MODE = "Burst Mode"

        // 0 / 43
        val SEQUENCE_NUMBER = "Sequence Number"

        // Normal / 44
        val CONTRAST_MODE = "Contrast Mode"

        // Standard (0) / 45
        val NOISE_REDUCTION = "Noise Reduction"

        // Off / 46
        val SELF_TIMER = "Self Timer"

        // 1 / 47
        val UNKNOWN_TAG__0X002F_ = "Unknown tag (0x002f)"

        // Horizontal / 48
        val ROTATION = "Rotation"

        // Fired / 49
        val AF_ASSIST_LAMP = "AF Assist Lamp"

        // Normal / 50
        val COLOR_MODE = "Color Mode"

        // null / 51
        val BABY_AGE = "Baby Age"

        // Standard / 52
        val OPTICAL_ZOOM_MODE = "Optical Zoom Mode"

        // Off / 53
        val CONVERSION_LENS = "Conversion Lens"

    }

    object PrintIM {

        val name = "PrintIM"

        // 0250 / 0
        val PRINTIM_VERSION = "PrintIM Version"

        // 0x00160016 / 1
        val UNKNOWN_TAG__0X0001_ = "Unknown tag (0x0001)"

        // 0x00000001 / 2
        val UNKNOWN_TAG__0X0002_ = "Unknown tag (0x0002)"

        // 0x00000064 / 3
        val UNKNOWN_TAG__0X0003_ = "Unknown tag (0x0003)"

        // 0x00000000 / 7
        val UNKNOWN_TAG__0X0007_ = "Unknown tag (0x0007)"

        // 0x00000000 / 8
        val UNKNOWN_TAG__0X0008_ = "Unknown tag (0x0008)"

        // 0x00000000 / 9
        val UNKNOWN_TAG__0X0009_ = "Unknown tag (0x0009)"

        // 0x00000000 / 10
        val UNKNOWN_TAG__0X000A_ = "Unknown tag (0x000a)"

        // 0x000000ac / 11
        val UNKNOWN_TAG__0X000B_ = "Unknown tag (0x000b)"

        // 0x00000000 / 12
        val UNKNOWN_TAG__0X000C_ = "Unknown tag (0x000c)"

        // 0x00000000 / 13
        val UNKNOWN_TAG__0X000D_ = "Unknown tag (0x000d)"

        // 0x000000c4 / 14
        val UNKNOWN_TAG__0X000E_ = "Unknown tag (0x000e)"

        // 0x00000005 / 256
        val UNKNOWN_TAG__0X0100_ = "Unknown tag (0x0100)"

        // 0x00000000 / 257
        val UNKNOWN_TAG__0X0101_ = "Unknown tag (0x0101)"

        // 0x00000080 / 272
        val UNKNOWN_TAG__0X0110_ = "Unknown tag (0x0110)"

    }

    object NikonMakernote {

        val name = "Nikon Makernote"

        // 2.00 / 1
        val FIRMWARE_VERSION = "Firmware Version"

        // Unknown (0 0) / 2
        val ISO = "ISO"

        // COLOR / 3
        val COLOR_MODE = "Color Mode"

        // BASIC  / 4
        val QUALITY_AND_FILE_FORMAT = "Quality & File Format"

        // AUTO         / 5
        val WHITE_BALANCE = "White Balance"

        // AUTO   / 6
        val SHARPENING = "Sharpening"

        // AF-S   / 7
        val AF_TYPE = "AF Type"

        // NORMAL  / 8
        val FLASH_SYNC_MODE = "Flash Sync Mode"

        // 9.04 / 10
        val UNKNOWN_TAG__0X000A_ = "Unknown tag (0x000a)"

        // AUTO   / 15
        val ISO_MODE = "ISO Mode"

        // [494 values] / 16
        val DATA_DUMP = "Data Dump"

        // 962 / 17
        val PREVIEW_IFD = "Preview IFD"

        // AUTO          / 128
        val IMAGE_ADJUSTMENT = "Image Adjustment"

        // OFF          / 130
        val ADAPTER = "Adapter"

        // 0 / 133
        val MANUAL_FOCUS_DISTANCE = "Manual Focus Distance"

        // No digital zoom / 134
        val DIGITAL_ZOOM = "Digital Zoom"

        // Centre / 136
        val AF_FOCUS_POSITION = "AF Focus Position"

        //                 / 143
        val SCENE_MODE = "Scene Mode"

        // 0 / 148
        val SATURATION = "Saturation"

        // OFF  / 149
        val NOISE_REDUCTION = "Noise Reduction"

        // 0 0 / 155
        val UNKNOWN_10 = "Unknown 10"

        //                     / 156
        val SCENE_ASSIST = "Scene Assist"

        // 0 / 157
        val UNKNOWN_11 = "Unknown 11"

        // 0 0 0 0 0 / 158
        val RETOUCH_HISTORY = "Retouch History"

    }

    object JpegComment {

        val name = "JpegComment"

        // AppleMark / 0
        val JPEG_COMMENT = "JPEG Comment"

    }

    object SonyMakernote {

        val name = "Sony Makernote"

        // 0 / 8192
        val UNKNOWN_TAG__0X2000_ = "Unknown tag (0x2000)"

        // [148 values] / 36865
        val UNKNOWN_TAG__0X9001_ = "Unknown tag (0x9001)"

        // [200 values] / 36866
        val UNKNOWN_TAG__0X9002_ = "Unknown tag (0x9002)"

        // [200 values] / 36867
        val UNKNOWN_TAG__0X9003_ = "Unknown tag (0x9003)"

        // [124 values] / 36868
        val UNKNOWN_TAG__0X9004_ = "Unknown tag (0x9004)"

        // [122 values] / 36869
        val UNKNOWN_TAG__0X9005_ = "Unknown tag (0x9005)"

        // [252 values] / 36870
        val UNKNOWN_TAG__0X9006_ = "Unknown tag (0x9006)"

        // [200 values] / 36871
        val UNKNOWN_TAG__0X9007_ = "Unknown tag (0x9007)"

        // [200 values] / 36872
        val UNKNOWN_TAG__0X9008_ = "Unknown tag (0x9008)"

    }

}