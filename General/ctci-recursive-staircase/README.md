## [Recursion: Davis' Staircase](https://www.hackerrank.com/challenges/ctci-recursive-staircase/problem)

**Domain:** General  
**Difficulty:** Medium  

**Problem Description:**

<div class='challenge_problem_statement'><div class='msB challenge_problem_statement_body'><div class='hackdown-content'><p>Davis has a number of staircases in his house and he likes to climb each staircase , , or  steps at a time. Being a very precocious child, he wonders how many ways there are to reach the top of the staircase.</p>

<p>Given the respective heights for each of the  staircases in his house, find and print the number of ways he can climb each staircase, module  on a new line.  </p>

<p><strong>Example</strong>   </p>

<p>  </p>

<p>The staircase has  steps.  Davis can step on the following sequences of steps:</p>

<div><pre><span></span><span>1</span> <span>1</span> <span>1</span> <span>1</span> <span>1</span>
<span>1</span> <span>1</span> <span>1</span> <span>2</span>
<span>1</span> <span>1</span> <span>2</span> <span>1</span> 
<span>1</span> <span>2</span> <span>1</span> <span>1</span>
<span>2</span> <span>1</span> <span>1</span> <span>1</span>
<span>1</span> <span>2</span> <span>2</span>
<span>2</span> <span>2</span> <span>1</span>
<span>2</span> <span>1</span> <span>2</span>
<span>1</span> <span>1</span> <span>3</span>
<span>1</span> <span>3</span> <span>1</span>
<span>3</span> <span>1</span> <span>1</span>
<span>2</span> <span>3</span>
<span>3</span> <span>2</span>
</pre></div>


<p>There are  possible ways he can take these  steps and  </p>

<p><strong>Function Description</strong></p>

<p>Complete the <em>stepPerms</em> function using recursion in the editor below.   </p>

<p>stepPerms has the following parameter(s):</p>

<ul>
<li><em>int n:</em> the number of stairs in the staircase   </li>
</ul>

<p><strong>Returns</strong>   </p>

<ul>
<li><em>int:</em> the number of ways Davis can climb the staircase, modulo 10000000007</li>
</ul></div></div></div><div class='challenge_input_format'><div class='msB challenge_input_format_title'><p><strong>Input Format</strong></p></div><div class='msB challenge_input_format_body'><div class='hackdown-content'><p>The first line contains a single integer, , the number of staircases in his house. <br>
Each of the following  lines contains a single integer, , the height of staircase . </p></div></div></div><div class='challenge_constraints'><div class='msB challenge_constraints_title'><p><strong>Constraints</strong></p></div><div class='msB challenge_constraints_body'><div class='hackdown-content'><ul>
<li></li>
<li></li>
</ul>

<p><strong>Subtasks</strong>        </p>

<ul>
<li> for  of the maximum score.</li>
</ul></div></div></div><div class='challenge_sample_input'><div class='msB challenge_sample_input_title'><p><strong>Sample Input</strong></p></div><div class='msB challenge_sample_input_body'><div class='hackdown-content'><pre>STDIN   Function
-----   --------
3       s = 3 (number of staircases)
1       first staircase n = 1
3       second n = 3
7       third n = 7
</pre></div></div></div><div class='challenge_sample_output'><div class='msB challenge_sample_output_title'><p><strong>Sample Output</strong></p></div><div class='msB challenge_sample_output_body'><div class='hackdown-content'><pre><code>1
4
44
</code></pre></div></div></div><div class='challenge_explanation'><div class='msB challenge_explanation_title'><p><strong>Explanation</strong></p></div><div class='msB challenge_explanation_body'><div class='hackdown-content'><p>Let's calculate the number of ways of climbing the first two of the Davis'  staircases:</p>

<ol>
<li>The first staircase only has  step, so there is only one way for him to climb it (i.e., by jumping  step). Thus, we print  on a new line.</li>
<li>The second staircase has  steps and he can climb it in any of the four following ways: <br>
<ol><li></li>
<li></li>
<li></li>
<li></li></ol></li>
</ol>

<p>Thus, we print  on a new line.</p></div></div></div>
