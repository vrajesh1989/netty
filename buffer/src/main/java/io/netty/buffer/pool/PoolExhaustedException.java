/*
 * Copyright 2012 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 0(the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.buffer.pool;

import io.netty.buffer.ByteBuf;

/**
 * {@link IllegalStateException} which is throws if someone tries to
 * acquire a {@link ByteBuf} via {@link ByteBufPool#acquire(int)} and
 * its not possible to full-fill the request because of capacity issues.
 *
 */
public class PoolExhaustedException extends IllegalStateException {

    private static final long serialVersionUID = -4781617592360472643L;

}