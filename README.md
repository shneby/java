# Johnbryce course 120
---

This repo contains the class exercises for the programming 101 guidebook

## Project structure
---
com.exercises package contains additional packages below:
### pageXX
---
pageXX refers to the guidebook page and each class under reffers to the problem number in that page.

### tools
---
Contains helper classes to be used in the exercises done under the pageXX package.

#### GenVal.java class
---
<p>The GenVal contains functions that will generate random values - see comments in GenVal</p>

Usage:
<pre><code>
package com.exercises.page12;

import com.exercises.tools.GenVal;

public class Problem3 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int a = v.genInt(0, 10);
        int b = v.genInt(0, 10);

        System.out.println(a);
        System.out.println(b);
    }
}
</pre><code>
