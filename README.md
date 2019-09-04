# java11-quickstart

### Java 9 New Features
* New Features
    * Module System
    * jShell
* Syntax Changes
    * private method in interface
    * <> can be used with anonymous inner class
    * enhanced try with resources

* API Changes
    * String: store data in byte array not char array. Same as StringBuilder and StringBuffer.
    * collection of() method: create a read only collection.
    * Stream API
    * Deprecated APIs:
    
### Java 10 New Features
* Local-Variable Type Inference
* Collection copyof() method: create a read only collection.

### Java 11 New Features
* Launching single-file program without compilation: only run the first class 
that has main method. It can only uses the classes that are defined inside the file.

* ZGC, A scalable low-latency garbage collector (Experimental)


## Appendix
### JDK 9 JEPs
* 102: Process API Updates
* 110: HTTP 2 Client
* 143: Improve Contended Locking
* 158: Unified JVM Logging
* 165: Compiler Control
* 193: Variable Handles
* 197: Segmented Code Cache
* 199: Smart Java Compilation, Phase Two
* 200: The Modular JDK
* 201: Modular Source Code
* 211: Elide Deprecation Warnings on Import Statements
* 212: Resolve Lint and Doclint Warnings
* 213: Milling Project Coin
* 214: Remove GC Combinations Deprecated in JDK 8
* 215: Tiered Attribution for javac
* 216: Process Import Statements Correctly
* 217: Annotations Pipeline 2.0
* 219: Datagram Transport Layer Security (DTLS)
* 220: Modular Run-Time Images
* 221: Simplified Doclet API
* 222: jshell: The Java Shell (Read-Eval-Print Loop)
* 223: New Version-String Scheme
* 224: HTML5 Javadoc
* 225: Javadoc Search
* 226: UTF-8 Property Files
* 227: Unicode 7.0
* 228: Add More Diagnostic Commands
* 229: Create PKCS12 Keystores by Default
* 231: Remove Launch-Time JRE Version Selection
* 232: Improve Secure Application Performance
* 233: Generate Run-Time Compiler Tests Automatically
* 235: Test Class-File Attributes Generated by javac
* 236: Parser API for Nashorn
* 237: Linux/AArch64 Port
* 238: Multi-Release JAR Files
* 240: Remove the JVM TI hprof Agent
* 241: Remove the jhat Tool
* 243: Java-Level JVM Compiler Interface
* 244: TLS Application-Layer Protocol Negotiation Extension
* 245: Validate JVM Command-Line Flag Arguments
* 246: Leverage CPU Instructions for GHASH and RSA
* 247: Compile for Older Platform Versions
* 248: Make G1 the Default Garbage Collector
* 249: OCSP Stapling for TLS
* 250: Store Interned Strings in CDS Archives
* 251: Multi-Resolution Images
* 252: Use CLDR Locale Data by Default
* 253: Prepare JavaFX UI Controls & CSS APIs for Modularization
* 254: Compact Strings
* 255: Merge Selected Xerces 2.11.0 Updates into JAXP
* 256: BeanInfo Annotations
* 257: Update JavaFX/Media to Newer Version of GStreamer
* 258: HarfBuzz Font-Layout Engine
* 259: Stack-Walking API
* 260: Encapsulate Most Internal APIs
* 261: Module System
* 262: TIFF Image I/O
* 263: HiDPI Graphics on Windows and Linux
* 264: Platform Logging API and Service
* 265: Marlin Graphics Renderer
* 266: More Concurrency Updates
* 267: Unicode 8.0
* 268: XML Catalogs
* 269: Convenience Factory Methods for Collections
* 270: Reserved Stack Areas for Critical Sections
* 271: Unified GC Logging
* 272: Platform-Specific Desktop Features
* 273: DRBG-Based SecureRandom Implementations
* 274: Enhanced Method Handles
* 275: Modular Java Application Packaging
* 276: Dynamic Linking of Language-Defined Object Models
* 277: Enhanced Deprecation
* 278: Additional Tests for Humongous Objects in G1
* 279: Improve Test-Failure Troubleshooting
* 280: Indify String Concatenation
* 281: HotSpot C++ Unit-Test Framework
* 282: jlink: The Java Linker
* 283: Enable GTK 3 on Linux
* 284: New HotSpot Build System
* 285: Spin-Wait Hints
* 287: SHA-3 Hash Algorithms
* 288: Disable SHA-1 Certificates
* 289: Deprecate the Applet API
* 290: Filter Incoming Serialization Data
* 291: Deprecate the Concurrent Mark Sweep (CMS) Garbage Collector
* 292: Implement Selected ECMAScript 6 Features in Nashorn
* 294: Linux/s390x Port
* 295: Ahead-of-Time Compilation
* 297: Unified arm32/arm64 Port
* 298: Remove Demos and Samples
* 299: Reorganize Documentation

### JDK 10 JEPs (12)
* 286: Local-Variable Type Inference
* 296: Consolidate the JDK Forest into a Single Repository
* 304: Garbage-Collector Interface
* 307: Parallel Full GC for G1
* 310: Application Class-Data Sharing
* 312: Thread-Local Handshakes
* 313: Remove the Native-Header Generation Tool (javah)
* 314: Additional Unicode Language-Tag Extensions
* 316: Heap Allocation on Alternative Memory Devices
* 317: Experimental Java-Based JIT Compiler
* 319: Root Certificates
* 322: Time-Based Release Versioning


### JDK 11 JEPs (LTS) (17)
* 181: Nest-Based Access Control
* 309: Dynamic Class-File Constants
* 315: Improve Aarch64 Intrinsics
* 321: HTTP Client (Standard)
* 323: Local-Variable Syntax for Lambda Parameters
* 324: Key Agreement with Curve25519 and Curve448
* 327: Unicode 10
* 328: Flight Recorder
* 329: ChaCha20 and Poly1305 Cryptographic Algorithms
* 330: Launch Single-File Source-Code Programs
* 331: Low-Overhead Heap Profiling
* 332: Transport Layer Security (TLS) 1.3
* 335: Deprecate the Nashorn JavaScript Engine
* 336: Deprecate the Pack200 Tools and API
* 320: Remove the Java EE and CORBA Modules
* 333: ZGC: A Scalable Low-Latency Garbage Collector (Experimental)
* 318: Epsilon: A No-Op Garbage Collector
