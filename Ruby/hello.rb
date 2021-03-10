include Math	# include module

# comment
=begin
Math Library
=end


# use module
puts("Hello, Ruby world!")
puts(sin(3.1415))


# data type
num = 123_455_55
alphabet = "abcdef"


# array
set = ["hello", "java", "python", "ruby"]
puts(set[0])


# struct
human = Struct.new(:name, :nation)

Mark = human.new
Mark.name = "Mark"

puts Mark.name

# judge
if num >= 2 then
	puts("x")
else
	print("y")
end

# loop
i = 10
while i > 5 do
	print(">")
	i -= 1
end

# iterator 迭代器
num = 3
num.times {
	print("h")
}
print("\n")


# define function
def method(a, b)
	puts(a + b)
end

a = 2
b = 4
method(a, b)

# module
module Hello
	puts("Hello, Ruby world!")
end


# hash
mouths = Hash.new("mouth")
mouths = {1 => "Jar", 2 => "Feb"}


# class & object

class Man	# class/module name CONSTANT Capitalize
	def initialize(id, name)	# initialize method
		@cust_id = id
		@cust_name = name
	end
	def myname()
		puts("#@cust_name")
	end
	def myid()
		puts("#@cust_id")
	end
end

mark = Man.new("1", "Mark")

mark.myname()
mark.myid()

