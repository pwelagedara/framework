#!/usr/bin/env bash

osascript -e 'tell app "Terminal"
    do script "docker run -p 6379:6379 -v /Users/admin/PERSONAL/PERSONAL888/redis:/data --name redis redis"
end tell'