package com.facebook.latencycheck;

import java.nio.ByteBuffer;

public class TestSettings {
  public int samplerate;
  public int timeout;
  int deviceId;
  ByteBuffer endSignal;
  int endSignalSize;
  ByteBuffer beginSignal;
  int beginSignalSize;
  int sampleRate;
  int playoutBufferSize;
  int recordBufferSize;
  String outputFilePath;
}
