## [Forming a Magic Square](https://www.hackerrank.com/challenges/magic-square-forming/problem)

**Domain:** Algorithms  
**Subdomain:** Implementation  
**Difficulty:** Medium  

**Problem Description:**

<div class='challenge_problem_statement'><div class='msB challenge_problem_statement_body'><div class='hackdown-content'><p>We define a <a href="https://en.wikipedia.org/wiki/Magic_square">magic square</a> to be an  matrix of distinct positive integers from  to  where the sum of any row, column, or diagonal of length  is always equal to the same number:  the <em>magic constant</em>. </p>

<p>You will be given a  matrix  of integers in the inclusive range . We can convert any digit  to any other digit  in the range  at cost of .  Given , convert it into a magic square at <em>minimal</em> cost. Print this cost on a new line.</p>

<p><strong>Note:</strong> The resulting magic square must contain distinct integers in the inclusive range .</p>

<p><strong>Example</strong>  </p>

<p>$s = [[5, 3, 4], [1, 5, 8], [6, 4, 2]]  </p>

<p>The matrix looks like this: </p>

<div><pre><span></span><span>5</span> <span>3</span> <span>4</span>
<span>1</span> <span>5</span> <span>8</span>
<span>6</span> <span>4</span> <span>2</span>
</pre></div>


<p>We can convert it to the following magic square:</p>

<div><pre><span></span><span>8</span> <span>3</span> <span>4</span>
<span>1</span> <span>5</span> <span>9</span>
<span>6</span> <span>7</span> <span>2</span>
</pre></div>


<p>This took three replacements at a cost of .</p>

<p><strong>Function Description</strong></p>

<p>Complete the <em>formingMagicSquare</em> function in the editor below.  </p>

<p>formingMagicSquare has the following parameter(s):  </p>

<ul>
<li><em>int s[3][3]:</em> a  array of integers  </li>
</ul>

<p><strong>Returns</strong>  </p>

<ul>
<li><em>int:</em>  the minimal total cost of converting the input square to a magic square </li>
</ul></div></div></div><div class='challenge_input_format'><div class='msB challenge_input_format_title'><p><strong>Input Format</strong></p></div><div class='msB challenge_input_format_body'><div class='hackdown-content'><p>Each of the  lines contains three space-separated integers of row .  </p></div></div></div><div class='challenge_constraints'><div class='msB challenge_constraints_title'><p><strong>Constraints</strong></p></div><div class='msB challenge_constraints_body'><div class='hackdown-content'><ul>
<li></li>
</ul></div></div></div><div class='challenge_sample_input'><div class='msB challenge_sample_input_title'><p><strong>Sample Input 0</strong></p></div><div class='msB challenge_sample_input_body'><div class='hackdown-content'><div><pre><span></span><span>4 9 2</span>
<span>3 5 7</span>
<span>8 1 5</span>
</pre></div>
</div></div></div><div class='challenge_sample_output'><div class='msB challenge_sample_output_title'><p><strong>Sample Output 0</strong></p></div><div class='msB challenge_sample_output_body'><div class='hackdown-content'><div><pre><span>1</span>
</pre></div>
</div></div></div><div class='challenge_explanation'><div class='msB challenge_explanation_title'><p><strong>Explanation 0</strong></p></div><div class='msB challenge_explanation_body'><div class='hackdown-content'><p>If we change the bottom right value, , from  to  at a cost of ,  becomes a magic square at the minimum possible cost.</p></div></div></div><div class='challenge_sample_input'><div class='msB challenge_sample_input_title'><p><strong>Sample Input 1</strong></p></div><div class='msB challenge_sample_input_body'><div class='hackdown-content'><div><pre><span></span><span>4 8 2</span>
<span>4 5 7</span>
<span>6 1 6</span>
</pre></div>
</div></div></div><div class='challenge_sample_output'><div class='msB challenge_sample_output_title'><p><strong>Sample Output 1</strong></p></div><div class='msB challenge_sample_output_body'><div class='hackdown-content'><div><pre><span>4</span>
</pre></div>
</div></div></div><div class='challenge_explanation'><div class='msB challenge_explanation_title'><p><strong>Explanation 1</strong></p></div><div class='msB challenge_explanation_body'><div class='hackdown-content'><p>Using 0-based indexing, if we make </p>

<ul>
<li>-&gt; at a cost of  </li>
<li>-&gt; at a cost of </li>
<li>-&gt; at a cost of ,  </li>
</ul>

<p>then the total cost will be .   </p></div></div></div>
