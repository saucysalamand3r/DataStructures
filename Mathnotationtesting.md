<!doctype html><html><head><meta charset='utf-8'>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/github-markdown-css/2.4.1/github-markdown.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.11.0/styles/default.min.css">
<link  rel="stylesheet" href="https://cdn.jsdelivr.net/npm/katex@0.10.0-rc.1/dist/katex.min.css" integrity="sha384-D+9gmBxUQogRLqvARvNLmA9hS2x//eK1FhVb9PiU86gmcrBrJAQT8okdJ4LMp2uv" crossorigin="anonymous">
<link rel="stylesheet" href="https://gitcdn.xyz/repo/goessner/mdmath/master/css/texmath.css">
<link rel="stylesheet" href="https://gitcdn.xyz/repo/goessner/mdmath/master/css/vscode-texmath.css">

</head><body class="markdown-body">
<h1 data-line="NaN" class="code-line code-line" id="red-black-trees">Red-Black Trees</h1>
<h2 data-line="NaN" class="code-line code-line" id="red-black-rules">Red-Black Rules</h2>
<p data-line="NaN" class="code-line code-line"><strong>1.</strong> Every node is either red or black.</p>
<p data-line="NaN" class="code-line code-line"><strong>2.</strong> The root is always black.</p>
<p data-line="NaN" class="code-line code-line"><strong>3.</strong> If a node is red, its children must be black (although the converse isn'tnessarily true).</p>
<p data-line="NaN" class="code-line code-line"><strong>4.</strong> Every path from the root to a leaf, or to a null child, must contain the same number of black nodes.</p>
<h2 data-line="NaN" class="code-line code-line" id="red-black-tree-tools">Red-Black Tree Tools</h2>
<ul>
<li data-line="NaN" class="code-line code-line"><strong>ROL</strong>
<ul>
<li data-line="NaN" class="code-line code-line"><em>ROL Carries out a left rotation. To rotate a group of nodes, the topmost node of the group to be rotated first. For a left rotation, the top node must have a right child.</em></li>
</ul>
</li>
<li data-line="NaN" class="code-line code-line"><strong>ROR</strong>
<ul>
<li data-line="NaN" class="code-line code-line"><em>ROR performs a right rotation. to rotate the top node, make sure it has a left child.</em></li>
</ul>
</li>
</ul>
<h2 data-line="NaN" class="code-line code-line" id="red-black-tree-efficency">Red-Black Tree Efficency</h2>
<p><span class="katex-display"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>O</mi><mo>(</mo><mi>l</mi><mi>o</mi><mi>g</mi><mi mathvariant="normal">_</mi><mn>2</mn><mo>(</mo><mi>n</mi><mo>)</mo><mo>)</mo></mrow><annotation encoding="application/x-tex">O(log\_{2}(n))</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height:1.06em;vertical-align:-0.31em;"></span><span class="mord mathit" style="margin-right:0.02778em;">O</span><span class="mopen">(</span><span class="mord mathit" style="margin-right:0.01968em;">l</span><span class="mord mathit">o</span><span class="mord mathit" style="margin-right:0.03588em;">g</span><span class="mord" style="margin-right:0.02778em;">_</span><span class="mord"><span class="mord">2</span></span><span class="mopen">(</span><span class="mord mathit">n</span><span class="mclose">)</span><span class="mclose">)</span></span></span></span></span></p>

</body></html>
