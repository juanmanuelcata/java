/* Copyright 2018 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.data;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.TInt64;
import org.tensorflow.types.family.TType;

/**
 * Creates a dataset that splits a SparseTensor into elements row-wise.
 */
public final class SparseTensorSliceDataset extends PrimitiveOp implements Operand<TType> {
  
  /**
   * Factory method to create a class wrapping a new SparseTensorSliceDataset operation.
   * 
   * @param scope current scope
   * @param indices 
   * @param values 
   * @param denseShape 
   * @return a new instance of SparseTensorSliceDataset
   */
  @Endpoint(describeByClass = true)
  public static <T extends TType> SparseTensorSliceDataset create(Scope scope, Operand<TInt64> indices, Operand<T> values, Operand<TInt64> denseShape) {
    OperationBuilder opBuilder = scope.env().opBuilder("SparseTensorSliceDataset", scope.makeOpName("SparseTensorSliceDataset"));
    opBuilder.addInput(indices.asOutput());
    opBuilder.addInput(values.asOutput());
    opBuilder.addInput(denseShape.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new SparseTensorSliceDataset(opBuilder.build());
  }
  
  /**
   */
  public Output<?> handle() {
    return handle;
  }
  
  @Override
  @SuppressWarnings("unchecked")
  public Output<TType> asOutput() {
    return (Output<TType>) handle;
  }
  
  private Output<?> handle;
  
  private SparseTensorSliceDataset(Operation operation) {
    super(operation);
    int outputIdx = 0;
    handle = operation.output(outputIdx++);
  }
}
