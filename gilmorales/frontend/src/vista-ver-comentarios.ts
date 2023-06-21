import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';

@customElement('vista-ver-comentarios')
export class VistaVerComentarios extends LitElement {
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
<vaadin-horizontal-layout id="vaadinHorizontalLayout" style="align-self: stretch; flex-grow: 1; height: 100%; width: 100%; z-index: 999;">
 <vaadin-vertical-layout theme="spacing" id="layoutInfo" style="flex-shrink: 0; width: 20%; height: 99%; align-items: center;">
  <vaadin-horizontal-layout theme="spacing" id="layoutpropietario" style="align-self: center;">
   <vaadin-vertical-layout theme="spacing" id="layoutFotoPerfil">
    <vaadin-avatar id="fotoPerfil"></vaadin-avatar>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout id="vaadinVerticalLayout1">
    <vaadin-button theme="tertiary" id="botonNombreUsuario">
      NombreUsuario 
    </vaadin-button>
    <label id="labelGeolocalizacion">Geolocalización</label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <label id="labelDescripcion" style="flex-grow: 0;">Descripción de la publicación...</label>
  <vaadin-vertical-layout theme="spacing" id="layoutEstadisticas" style="align-self: center; flex-grow: 0; justify-content: center; align-items: flex-start; flex-shrink: 0; width: 100%;">
   <vaadin-horizontal-layout theme="spacing" id="layoutMeGustas" style="margin-left: var(--lumo-space-xl); flex-shrink: 0;">
    <label id="numMeGustas" style="align-self: center;">0</label>
    <vaadin-button id="botonMeGusta">
      Me Gusta 
    </vaadin-button>
    <label id="labelNumMeGustas" style="align-self: center;">Numero Me Gustas</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl);" id="layoutNumComentarios">
    <label id="numComentarios" style="align-self: center;">0</label>
    <label id="labelComentarios">Numero Comentaios</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl);" id="layoutVisualizaciones">
    <label id="numVisualizaciones" style="align-self: center;">0</label>
    <label id="labelVisualizaciones">Numero Visualizaciones</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutSeguidores" style="flex-grow: 0; align-self: stretch; flex-shrink: 0;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="margin-left: var(--lumo-space-xl);">
    <label id="numSeguidores">0</label>
    <label id="labelSeguidores">Numero de Seguidores</label>
   </vaadin-horizontal-layout>
   <vaadin-button id="botonSeguir" style="align-self: center;">
     Seguir 
   </vaadin-button>
   <vaadin-button id="botonEliminarAdmi" style="align-self: center;">
     Eliminar Publicación 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing-s" id="vaadinVerticalLayout2" style="flex-grow: 0; flex-shrink: 0; height: 100%; width: 80%;">
  <vaadin-vertical-layout theme="spacing" id="layoutListaComentarios" style="flex-grow: 0; width: 100%; flex-shrink: 0; height: 94%;"></vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing-s" id="layoutComentar" style="margin: var(--lumo-space-xs); width: 100%; flex-shrink: 0;">
   <vaadin-text-field label="" placeholder="Escribe tu comentario..." id="textFieldCmentario" style="flex-grow: 1;"></vaadin-text-field>
   <vaadin-button id="botonComentar">
     Comentar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
