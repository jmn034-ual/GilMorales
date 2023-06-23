import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-editar-perfil')
export class VistaEditarPerfil extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 50%; height: 70%; background-color: #ffffff; z-index: 999; margin-left: 25%; position: fixed; align-items: center; max-width: 50%; border-radius: 10px;" id="layoutEditarPerfil" theme="spacing-s">
 <vaadin-horizontal-layout theme="spacing" id="layoutTitulo" style="align-self: stretch; justify-content: center; background-color: #AED6F1">
  <h2 id="titulo">Editar Perfil</h2>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; flex-shrink: 0; flex-grow: 0; height: 70%;">
  <vaadin-horizontal-layout theme="spacing" id="layoutFoto" style="width: 100%; flex-shrink: 0;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="flex-grow: 0; justify-content: flex-end; flex-shrink: 0; width: 46%;">
    <label id="labelFoto" style="align-self: center;">Foto de perfil:</label>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" id="layoutImagen">
    <vaadin-avatar id="fotoPerfil"></vaadin-avatar>
   </vaadin-vertical-layout>
   <vaadin-button id="botonCambiar" style="align-self: center;">
     Cambiar 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="layoutNombreUsuario" style="flex-shrink: 0; width: 100%;">
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; justify-content: flex-end; flex-shrink: 0; width: 46%;" id="vaadinHorizontalLayout1">
    <label style="align-self: center; flex-shrink: 0;" id="labelNombreUsuario">Nombre de Usuario:</label>
   </vaadin-horizontal-layout>
   <vaadin-text-field placeholder="NombreUsuario" id="textFieldNombreUsuario" style="align-self: center;"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; width: 100%; align-self: stretch;" id="layoutNombre">
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; justify-content: flex-end; flex-shrink: 0; width: 46%;" id="vaadinHorizontalLayout2">
    <label style="align-self: center; flex-shrink: 0;" id="labelNombre">Nombre:</label>
   </vaadin-horizontal-layout>
   <vaadin-text-field placeholder="Nombre" style="align-self: center; flex-grow: 0;" id="textFieldNombre"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; width: 100%; height: 30%; align-self: center;" id="vaadinHorizontalLayout3">
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; justify-content: flex-end; flex-shrink: 0; width: 46%; align-self: flex-start;" id="vaadinHorizontalLayout4">
    <label style="align-self: center;" id="labelDecripcion">Descripción corta:</label>
   </vaadin-horizontal-layout>
   <vaadin-text-area id="textAreaDescripcion" style="height: 90%; flex-shrink: 0;"></vaadin-text-area>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" id="vaadinHorizontalLayout5" style="justify-content: center; margin: var(--lumo-space-m); align-self: flex-end; margin-right: var(--lumo-space-xl);">
   <vaadin-button id="botonCancelar">
     Cancelar 
   </vaadin-button>
   <vaadin-button id="botonGuardar">
     Guardar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
