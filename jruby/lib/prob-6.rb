class Fixnum
  def squared
    self * self
  end
end

def sum_squares(start, _end)
  (start.._end).map(&:squared).reduce(&:+)
end

def squared_sums(start, _end)
  (start.._end).reduce(&:+).squared
end

def difference(start, _end)
  squared_sums(start, _end) - sum_squares(start, _end)

end

puts "Difference is: #{difference 1, 100}"
