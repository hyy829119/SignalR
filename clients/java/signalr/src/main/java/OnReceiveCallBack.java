// Copyright (c) .NET Foundation. All rights reserved.
// Licensed under the Apache License, Version 2.0. See License.txt in the project root for license information.

import com.google.gson.JsonObject;

public interface OnReceiveCallBack {
    void invoke(JsonObject message);
}
