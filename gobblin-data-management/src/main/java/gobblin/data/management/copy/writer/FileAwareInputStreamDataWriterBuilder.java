/*
 * Copyright (C) 2014-2015 LinkedIn Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.
 */
package gobblin.data.management.copy.writer;

import gobblin.configuration.ConfigurationKeys;
import gobblin.configuration.State;
import gobblin.data.management.copy.FileAwareInputStream;
import gobblin.writer.DataWriter;
import gobblin.writer.DataWriterBuilder;

import java.io.IOException;

/**
 * A {@link DataWriterBuilder} for {@link FileAwareInputStreamDataWriter}
 */
public class FileAwareInputStreamDataWriterBuilder extends DataWriterBuilder<String, FileAwareInputStream> {
  @Override
  public DataWriter<FileAwareInputStream> build() throws IOException {
    State properties = this.destination.getProperties();
    properties.setProp(ConfigurationKeys.WRITER_FILE_PATH, this.writerId);
    return new FileAwareInputStreamDataWriter(properties, this.branches, this.branch);
  }
}
