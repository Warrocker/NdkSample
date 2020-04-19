cmake_minimum_required(VERSION 3.4.1)

set(CMAKE_VERBOSE_MAKEFILE on)

set(lib_directory ${PROJECT_SOURCE_DIR}/../../../jniLibs/number)

add_library(lib_number SHARED IMPORTED)
set_target_properties(lib_number PROPERTIES IMPORTED_LOCATION
        ${lib_directory}/lib/${ANDROID_ABI}/libnumber.so)

add_library(number-utils SHARED
        number-utils.cpp)

target_include_directories(number-utils PRIVATE
        ${lib_directory}/include)

target_link_libraries(number-utils
        lib_number)
