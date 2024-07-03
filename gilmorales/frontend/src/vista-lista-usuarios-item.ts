import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-lista-usuarios-item')
export class VistaListaUsuariosItem extends LitElement {
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
<vaadin-horizontal-layout id="vaadinHorizontalLayout" style="z-index: 11; align-items: center; border-radius: 10px; box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.2);">
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; overflow: hidden; flex-shrink: 0; width: 500px; background-color: black; color: white; border-radius: 10px; box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.2);">
  <vaadin-vertical-layout theme="spacing" id="labelInformacion" style="border-radius: 10px; background-color: #F5F5F5; align-self: center; flex-shrink: 0; width: 90%; padding: var(--lumo-space-s); color: black; margin-top: var(--lumo-space-xl);">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
    <vaadin-avatar id="fotoPerfil" style="align-self: center;"></vaadin-avatar>
    <vaadin-button theme="tertiary" id="botonNombreUsuario" style="z-index: 999; color: black; font-weight: bold;">
      NombreUsuario 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <label id="labelNombreCompleto" style="width: 100%;">Nombre Completo Usuario</label>
   <label id="labelDescripcion" style="width: 100%;">Descripción corta</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="layoutPublicacion" style="align-self: center; flex-grow: 0; flex-shrink: 0; display: flex; justify-content: center; align-items: center; overflow: hidden; height: 700px; background-color: black; width: 100%;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
