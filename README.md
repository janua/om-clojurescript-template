# om-clojurescript-template

A template to get up and running quickly with `clojure`, `clojurescipt` and `om`.

## Usage

All Clojurescript files under `src-cljs-main` are compiled and output to `output/main.js`.

Main html file is `main.html` in root.

#### With Leiningen

`lein`

`lein cljsbuild once` or `lein cljsbuild auto`

#### !Remember

If and when you move away from `om-clojurescript-template.core` to your own name, the javascript reference in `main.html` needs to use underscore.

In this template, it is `om-clojurescript-template.core` in `project.clj` and `.cljs` files, and in javascript it is imported as `goog.require("om_clojurescript_template.core")`

## License

Copyright © 2014

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
