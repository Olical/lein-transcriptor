# lein-transcriptor [![Clojars Project](https://img.shields.io/clojars/v/olical/lein-transcriptor.svg)](https://clojars.org/olical/lein-transcriptor)

Execute all of your project's `.repl` files with [transcriptor][].

## Usage

Add the desired `olical/lein-transcriptor` version to your `:plugins` vector and `com.cognitect/transcriptor` to your `:dependencies`.

You may need to upgrade your Clojure version to one that has `clojure.spec` support.

```sh
# This will execute all of your .repl files in this directory or below.
lein transcriptor

# You can provide a path to run all .repl files under that specific path.
# When you don't provide a path, it defaults to "."
lein transcriptor ./my/repl-files
```

## Unlicenced

Find the full [unlicense][] in the `UNLICENSE` file, but here's a snippet.

>This is free and unencumbered software released into the public domain.
>
>Anyone is free to copy, modify, publish, use, compile, sell, or distribute this software, either in source code form or as a compiled binary, for any purpose, commercial or non-commercial, and by any means.

Do what you want. Learn as much as you can. Unlicense more software.

[unlicense]: http://unlicense.org/
[transcriptor]: https://github.com/cognitect-labs/transcriptor
