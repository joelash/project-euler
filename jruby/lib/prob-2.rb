def fib_to(stop)
  p2, p1 = 1, 2
  yield p2
  yield p1
  while (next_num = p2 + p1) <= stop do
    yield next_num
    p2, p1 = p1, next_num
  end
end

total = 0
fib_to 4_000_000 do |num|
  total += num if num.even?
end

puts "Sum: #{total}"
