<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- <c:url value="/resources/" /> -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>
			Avaliações<small>Cadastro de Avaliações</small>
		</h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> Avaliações</a></li>
			<li class="active">Avaliações</li>
		</ol>
	</section>
	<!-- Main content -->
	<section class="content">
	<div class="row">
		<div class="col-xs-12">
			<div class="box">
				<div class="box-header">
					<h3 class="box-title">Avaliações</h3>
				</div>
				<!-- /.box-header -->
				<div class="box-body">
					<!-- .box-body -->
					<table id="example1" class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>Id</th>
								<th>Disciplina</th>
								<th>Professor</th>
								<th>Descrição</th>
								<th>Dificuldade</th>
								<th>Aplicação</th>
								<th>Inclusão</th>

							</tr>
						</thead>
						<tbody>
							<c:forEach items="${avaliacoes}" var="avaliacao">
								<tr>
									<td><a href='<spring:url value="/avaliacoes/${avaliacao.id}.html"></spring:url>'>${avaliacao.id}</a></td>
									<td>${avaliacao.disciplina}</td>
									<td>${avaliacao.professor}</td>
									<td>${avaliacao.descricao}</td>
									<td>${avaliacao.dificuldade}</td>
									<td>${avaliacao.aplicacao}</td>
									<td>${avaliacao.inclusao}</td>
									
								</tr>
							</c:forEach>
						</tbody>

					</table>
				</div>
				<!-- /.box-body -->
				<div class="box-footer">
					<a href='<spring:url value="/avaliacao-register.html"></spring:url>'>
						<button class="btn btn-primary">Nova Avaliação</button>
					</a>
				</div>
			</div>
			<!-- /.box -->
		</div>
		<!-- /.col -->
	</div>
	<!-- /.row --> </section>
	<!-- /.content -->
</div>
<!-- /.content-wrapper -->

