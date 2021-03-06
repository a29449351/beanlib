/*
 * Copyright 2007 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.sf.beanlib.spi.replicator;

import net.sf.beanlib.spi.BeanTransformerSpi;

/**
 * Immutable Object Replicator SPI.
 *
 * @author Joe D. Velopar
 */
public interface ImmutableReplicatorSpi {

    /**
     * Immutable Object Replicator Factory SPI.
     *
     * @author Joe D. Velopar
     */
    interface Factory {

        ImmutableReplicatorSpi newImmutableReplicatable(BeanTransformerSpi beanTransformer);
    }

    /**
     * Returns a replicated immutable object.
     *
     * @param <V> source immutable object type
     * @param <T> target class type
     * @param immutable source immutable object
     * @param toClass target class
     */
    <V, T> T replicateImmutable(V immutable, Class<T> toClass);
}
